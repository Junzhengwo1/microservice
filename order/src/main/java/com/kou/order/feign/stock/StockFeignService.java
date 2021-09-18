package com.kou.order.feign.stock;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@EnableFeignClients
@FeignClient(name = "stock-service",path = "/api/stock")
public interface StockFeignService {

    @RequestMapping("/reduce")
    public String reduce();
}
