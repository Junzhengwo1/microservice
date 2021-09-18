package com.kou.order.controller;

import com.kou.order.feign.stock.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/order")
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;

    //使用openFeign
    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String addOrder(){
        System.out.println("下单成功");
        //订单这边调用库存的接口
        // todo 在没使用微服务架构的情况下，不同模块之间的调用
        //String msg = restTemplate.getForObject("http://stock-service/api/stock/reduce", String.class);

        // TODO 使用了 Feign 后相互调用 就像是调用方法一样（在服务的消费端）
        String msg = stockFeignService.reduce();

        return "hello"+msg;
    }


}
