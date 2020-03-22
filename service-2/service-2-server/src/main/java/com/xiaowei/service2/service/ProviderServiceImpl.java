package com.xiaowei.service2.service;

import com.xiaowei.service1.api.ConsumerService;
import com.xiaowei.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA.
 * User：modderBUG
 * Date：2020/3/2215:27
 * Version:1.0
 * Desc:
 */
@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String service() {
        return "service2-server | Provider Invoke";
    }
}
