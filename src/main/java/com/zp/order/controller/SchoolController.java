package com.zp.order.controller;

import com.zp.order.entity.School;
import com.zp.order.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @GetMapping("getSchool")
    public void findAllSchool(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {

        List<School> allSchool = schoolService.findAllSchool(pageNum,pageSize);

        for (School school : allSchool) {
            System.out.println(school.toString());
        }

    }


    @GetMapping("querySchools")
    public void querySchools(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {

        List<School> allSchool = schoolService.querySchools(pageNum,pageSize);

        for (School school : allSchool) {
            System.out.println(school.toString());
        }

    }
}
