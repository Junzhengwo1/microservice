package com.kou.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    //todo 使用了Feign 就不需要这样去调用了
//    @Bean
//    @LoadBalanced // nacos 注册中心
//    public RestTemplate restTemplateSelf(RestTemplateBuilder builder){
//        return builder.build();
//    }

    //Ribbon
    //TODO 修改负载均衡策略 (服务消费端)
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }

}
