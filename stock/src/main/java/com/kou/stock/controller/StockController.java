package com.kou.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @RequestMapping("/reduce")
    public String reduce(){
        System.out.println("扣减成功");
        return "扣减成功";
    }
}
