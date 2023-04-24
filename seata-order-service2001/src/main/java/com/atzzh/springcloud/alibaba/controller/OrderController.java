package com.atzzh.springcloud.alibaba.controller;

import com.atzzh.springcloud.alibaba.domain.CommonResult;
import com.atzzh.springcloud.alibaba.domain.Order;
import com.atzzh.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    //浏览器智能发送get
    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建完成");
    }
}
