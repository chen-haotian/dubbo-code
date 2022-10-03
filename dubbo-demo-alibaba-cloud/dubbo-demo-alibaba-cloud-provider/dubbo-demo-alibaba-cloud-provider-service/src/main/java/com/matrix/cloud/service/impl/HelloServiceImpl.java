package com.matrix.cloud.service.impl;

import com.matrix.cloud.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @Author: Matrix
 * @Date: 2022-10-01 10:46:47
 * @Version: v1.0.3
 * @Description: HelloService的具体实现
 */
@DubboService(version = "v1.0.3", timeout = 3000)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress() + "；Spring Cloud Alibaba Dubbo";
    }
}
