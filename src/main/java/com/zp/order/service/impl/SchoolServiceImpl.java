package com.zp.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zp.order.entity.School;
import com.zp.order.entity.criteria.SchoolExample;
import com.zp.order.mapper.mapping.SchoolMapper;
import com.zp.order.mapper.mapping.other.SchoolOtherMapper;
import com.zp.order.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
}
