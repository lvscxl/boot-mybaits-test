package com.zp.order.service;

import com.zp.order.entity.Customer;
import com.zp.order.entity.CustomerVO;

import java.util.List;

public interface CustomerService {
    List<CustomerVO> findAllCustomer(Integer pageNum, Integer pageSize);
}
