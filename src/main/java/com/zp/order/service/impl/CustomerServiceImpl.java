package com.zp.order.service.impl;

import com.zp.order.entity.Customer;
import com.zp.order.entity.CustomerVO;
import com.zp.order.entity.criteria.CustomerExample;
import com.zp.order.mapper.CustomerMapper;
import com.zp.order.service.CustomerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    private volatile Long cnt = 0L;
    private volatile Long total = 0L;

    @Override
    public List<CustomerVO> findAllCustomer(Integer pageNum, Integer pageSize) {

        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Customer> customers = customerMapper.selectByExample(customerExample);

        List<CustomerVO> vos = new ArrayList<>();
        for (Customer customer : customers) {
            CustomerVO customerVO = new CustomerVO();
            BeanUtils.copyProperties(customer,customerVO);
            vos.add(customerVO);
        }

        List<CustomerVO> childrenCustomer = getChildrenCustomer(vos, null);

        List<CustomerVO> newArr = new ArrayList<>();
        List<CustomerVO> customer = getCustomer(childrenCustomer, newArr);
        for (CustomerVO customerVO : customer) {
            System.out.println(" customerVO ++++++++>" + customerVO.toString());
        }
        return customer;
        //return childrenCustomer;
    }

    private List<CustomerVO> getChildrenCustomer(List<CustomerVO> list,String pid) {

        List<CustomerVO> objects = new ArrayList<>();
        System.out.println("pid =" + pid+"====cnt ====" + cnt++);
        for (CustomerVO item : list) {
            System.out.println("  item *********" + item.toString());
            if (StringUtils.equals(item.getParentId(),pid) ) {
                System.out.println("        item ##############" + item.toString());
                item.setChildren(getChildrenCustomer(list,item.getId()));
                objects.add(item);
                //getChildrenCustomer(list,item.getId());
            }
        }

        System.out.println("              objects"  + objects.size());
        System.out.println("                    pid =" + pid+" -----total ---->"  + total++);
        //System.out.println(" total ---->"  + total++);
        return objects;

    }

    private List<CustomerVO> getCustomer(List<CustomerVO> list, List<CustomerVO> newList) {

        System.out.println("%%%%%%%%%%%%%%%%%" + newList.size());
        for (CustomerVO customerVO : list) {
            //System.out.println("%%%%%%%%%%%%%%%%%" + customerVO.toString());
            CustomerVO customerVO1 = new CustomerVO();
            BeanUtils.copyProperties(customerVO, customerVO1);

            newList.add(customerVO1);

            if (!CollectionUtils.isEmpty(customerVO.getChildren())) {
                this.getCustomer(customerVO.getChildren(),newList);
            }
        }

        for (CustomerVO customerVO : newList) {
            System.out.println(" customerVO ----->====" + customerVO.toString());
        }
        return newList;
    }


}
