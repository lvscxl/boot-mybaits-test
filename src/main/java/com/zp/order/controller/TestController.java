package com.zp.order.controller;

import com.zp.order.entity.CustomerVO;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("getTest")
    public void findAllCustomer() {

        CustomerVO customerVO = new CustomerVO();
        customerVO.setName(null);

        BigDecimal bigDecimal = new BigDecimal(23.121849);
        BigDecimal bigDecimal1 = new BigDecimal("23.121849");

        if (StringUtils.isEmpty(customerVO.getName())) {
            System.out.println(" name ==="+customerVO.getName());
            System.out.println(" bigDecimal ==="+bigDecimal);
            System.out.println(" bigDecimal1 ==="+bigDecimal1);
        }
    }
}
