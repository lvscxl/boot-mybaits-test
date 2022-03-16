package com.zp.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.order.entity.School;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface SchoolService {

    List<School> findAllSchool(Integer pageNum, Integer pageSize);

    List<School> querySchools(Integer pageNum, Integer pageSize);

    void editSchool(String schoolName);


    List<School> querySchoolByPage(Integer pageNum, Integer pageSize);

    List<School> findSchools(Integer pageNum, Integer pageSize);

}
