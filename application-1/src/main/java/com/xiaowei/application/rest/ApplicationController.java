package com.xiaowei.application.rest;

import com.xiaowei.service1.api.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User：modderBUG
 * Date：2020/3/2215:02
 * Version:1.0
 * Desc:
 */
@RestController
@RequestMapping("/service")
public class ApplicationController {

    @org.apache.dubbo.config.annotation.Reference
    private ConsumerService consumerService;

    @GetMapping
    String service(){
        String target=consumerService.service();
        return "application-1|test|"+target;
    }
}
