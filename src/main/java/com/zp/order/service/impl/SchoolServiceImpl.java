package com.zp.order.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zp.order.entity.School;
import com.zp.order.entity.criteria.SchoolExample;
import com.zp.order.mapper.mapping.SchoolMapper;
import com.zp.order.mapper.mapping.other.SchoolOtherMapper;
import com.zp.order.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("schoolService")
public class SchoolServiceImpl  implements SchoolService {

    @Autowired
    SchoolMapper schoolMapper;

    @Autowired
    SchoolOtherMapper schoolOtherMapper;

    @Override
    public List<School> findAllSchool(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        SchoolExample schoolExample = new SchoolExample();
        SchoolExample.Criteria criteria = schoolExample.createCriteria();
        criteria.andStatusEqualTo(1);

        List<School> schools = schoolMapper.selectByExample(schoolExample);
        PageInfo<School> pageInfo = new PageInfo<>();
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setList(schools);
        return schools;
    }

    @Override
    public List<School> querySchools(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<School> schools = schoolOtherMapper.querySchools();
        PageInfo<School> pageInfo = new PageInfo<>(schools);
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setList(schools);
        return schools;
    }

    @Override
    public void editSchool(String schoolName) {

    }

    @Override
    public List<School> querySchoolByPage(Integer pageNum, Integer pageSize) {
        Page<Object> page = new Page<>(pageNum, pageSize);

        Page<School> schoolPage = schoolOtherMapper.querySchoolByPage(page);
        return schoolPage.getRecords();
    }

    @Override
    public List<School> findSchools(Integer pageNum, Integer pageSize) {
        Page<School> objectPage = new Page<>(pageNum, pageSize);
        Page<School> page = new LambdaQueryChainWrapper<>(schoolMapper)
                .page(objectPage);
        return page.getRecords();
    }


    public void addSchool(String schoolName) {



    }
}
