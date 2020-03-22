package com.xiaowei.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * User：modderBUG
 * Date：2020/3/2215:38
 * Version:1.0
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service1Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service1Bootstrap.class,args);
    }
}
