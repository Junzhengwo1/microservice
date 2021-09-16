package com.kou.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String addOrder(){
        System.out.println("下单成功");
        //订单这边调用库存的接口
        // todo 在没使用微服务架构的情况下，不同模块之间的调用
        String msg = restTemplate.getForObject("http://localhost:8021/api/stock/reduce", String.class);
        return "hello"+msg;
    }


}
