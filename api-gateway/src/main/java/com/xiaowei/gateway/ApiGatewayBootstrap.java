package com.xiaowei.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created with IntelliJ IDEA.
 * User：modderBUG
 * Date：2020/3/2216:43
 * Version:1.0
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApiGatewayBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayBootstrap.class,args);
    }
}
