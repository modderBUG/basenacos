package com.xiaowei.service1.service;

import com.xiaowei.service1.api.ConsumerService;
import com.xiaowei.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA.
 * User：modderBUG
 * Date：2020/3/2215:27
 * Version:1.0
 * Desc:
 */
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {

    @org.apache.dubbo.config.annotation.Reference
    private ProviderService providerService;

    @Override
    public String service() {
        return "service1-server | Consumer Invoke"+providerService.service();
    }
}
