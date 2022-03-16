package com.zp.order.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonParser;
import com.zp.order.service.test1.TagConfig;
import com.zp.order.service.test1.TagData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("product")
public class PPController {

    @GetMapping("getProduct")
    public void querySchools1() {

        String strdata ="{\"companyId\":\"269931278217394676665406\",\"isNew\":true,\"productId\":\"2482533657768315748\",\"tagId\":\"1000228119323033859\",\"tagType\":1,\"textConfig\":{\"tagDatas\":[{\"costPrice\":0,\"freeShippingAmount\":0,\"logisticsFee\":0,\"oldPrice\":0,\"price\":100.01,\"skuId\":\"9189160890674006170\"}],\"tagL1\":{\"addrs\":[\"\"],\"pics\":[\"\"],\"tagLabel\":\"产地\",\"tagNames\":[\"家养\"]},\"tagL2\":{\"addrs\":[\"\"],\"pics\":[\"\"],\"tagLabel\":\"规格\",\"tagNames\":[\"10罐装\"]}},\"updateTime\":1587090136000}";


        TagConfig newTagConfig = JSON.parseObject(strdata, TagConfig.class);
        TagConfig oldconfig = JSON.parseObject(strdata, TagConfig.class);
        TagConfig tagConfig = new TagConfig();
        TagData[] oldTagDataList = oldconfig.getTextConfig().getTagDatas();
        TagData[] newTagDataArray = newTagConfig.getTextConfig().getTagDatas();

        try {
            skuCheckInfoChanged(newTagDataArray,oldTagDataList);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    private boolean skuCheckInfoChanged(TagData[] newTagDataArray,TagData[] oldTagDataArray) throws Exception {
        if(newTagDataArray.length != oldTagDataArray.length){
            // 新旧sku数量对不上，规格改变了
            return true;
        }

        List<TagData> newTagDataList = Arrays.asList(newTagDataArray);
        List<TagData> oldTagDataList = Arrays.asList(oldTagDataArray);

        // 将newTagData和oldTagData 转为skuId为key的map，方便进行比较
        Map<String,TagData> newTagDataMap = this.beanListToMapGeneric(newTagDataList,"skuId");
        Map<String,TagData> oldTagDataMap = this.beanListToMapGeneric(oldTagDataList,"skuId");

        // 遍历新sku Map，和老sku进行逐一的比较
        for(Map.Entry<String,TagData> newTagDataEntry : newTagDataMap.entrySet()){
            String skuID = newTagDataEntry.getKey();
            TagData newTagDataItem = newTagDataEntry.getValue();

            // 获得老sku中 skuID对应的数据项
            TagData oldTagDataItem = oldTagDataMap.get(skuID);
            if(oldTagDataItem == null){
                // sku项不匹配
                return true;
            }else{
                // sku项匹配

                // 新旧sku进行比较
                //修改sku价格  不在进行 sku删除  此处需要注释调
                if(singleSkuCheckInfoChanged(newTagDataItem,oldTagDataItem)){
                    return true;
                }

                // 否则继续循环
            }
        }
        // 遍历结束，说明所有的sku审核属性都没有被改变
        return false;
    }
    public static <T> Map<String, T> beanListToMapGeneric(List<T> beanList, String keyName) throws Exception {
        //:::创建一个map
        Map<String, T> map = new HashMap();

        //:::由keyName获得对应的get方法字符串
        String getMethodName = makeGetMethodName(keyName);

        try {
            //:::遍历beanList
            for (T obj : beanList) {

                //:::获得get方法
                Method getMethod = obj.getClass().getMethod(getMethodName);

                //:::通过get方法从bean对象中得到数据key
                String result = (String) getMethod.invoke(obj);

                //:::放入map中(如果key一样,则会被覆盖去重)
                map.put(result, obj);
            }
        } catch (Exception e) {
            throw new Exception(e);
        }

        //:::返回结果
        return map;
    }

    private static String makeGetMethodName(String keyName) {
        //:::将第一个字母转为大写
        String newKeyName = transFirstCharUpperCase(keyName);

        String getMethodName = "get" + newKeyName;

        return getMethodName;
    }

    private static String transFirstCharUpperCase(String str) {
        return str.replaceFirst(str.substring(0, 1), str.substring(0, 1).toUpperCase());
    }


    private boolean singleSkuCheckInfoChanged(TagData newTagData,TagData oldTagData){
        // 现价是否改变
        if(newTagData.getPrice().compareTo(oldTagData.getPrice()) != 0){
            return true;
        }

        if(newTagData.getOldPrice() != null && oldTagData.getOldPrice() != null){
            // 原价是否改变
            if(newTagData.getOldPrice().compareTo(oldTagData.getOldPrice()) != 0){
                return true;
            }
        }

        // 成本价是否改变
        if(newTagData.getCostPrice().compareTo(oldTagData.getCostPrice()) != 0){
            return true;
        }

        return false;
    }
}
