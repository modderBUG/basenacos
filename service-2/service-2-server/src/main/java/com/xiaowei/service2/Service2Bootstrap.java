package com.xiaowei.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * User：modderBUG
 * Date：2020/3/2216:08
 * Version:1.0
 * Desc:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Service2Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service2Bootstrap.class,args);
    }
}
