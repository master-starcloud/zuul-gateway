package com.xingyun.zuul.apigateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.xingyun.zuul"})
//@EnableFeignClients(basePackages = {"com.xingyun.zuul.apigateway"})
//@MapperScan(basePackages = "com.xingyun.zuul.apigateway.dao")
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableScheduling
//@EnableCircuitBreaker
@Slf4j
@EnableZuulProxy
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
        LOGGER.info("ApiGatewayApplication started success");
    }
}
