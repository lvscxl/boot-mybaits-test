package com.zp.order.controller;

import com.zp.order.entity.Customer;
import com.zp.order.entity.CustomerVO;
import com.zp.order.entity.School;
import com.zp.order.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("getCustomer")
    public List<CustomerVO> findAllCustomer(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {

        List<CustomerVO> allCustomer =  customerService.findAllCustomer(pageNum,pageSize);

        for (CustomerVO customer : allCustomer) {
            System.out.println(customer.toString());
        }


        return allCustomer;

    }

    @GetMapping("getAllCustomer")
    public List<CustomerVO> findAllCustomer1() {

        List<CustomerVO> allCustomer =  null;
        //List<CustomerVO> allCustomer =  new ArrayList<>();

        List<CustomerVO> customerVOS = allCustomer.stream().filter(item -> !ObjectUtils.isEmpty(item)).collect(Collectors.toList());

        customerVOS.forEach( item ->{
            System.out.println(item.toString());
        });
        List<CustomerVO> allCustomers =  new ArrayList<>();
        allCustomers.forEach( item ->{
            System.out.println(item.toString());
            System.out.println(" allCustomers ======"+item.toString());
        });


        //List<CustomerVO> allCustomers1 =  null;
        List<CustomerVO> allCustomers12 =   new ArrayList<>();
        for (CustomerVO customer : allCustomers12) {

            System.out.println(" allCustomers12 ======"+customer.toString());
            System.out.println(customer.toString());
        }


        return allCustomer;

    }
}
