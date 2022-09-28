package com.matrix.service.impl;

import com.matrix.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 13:31:07
 * @Version: v1.0.1
 * @Description: HelloService的具体实现
 */
@DubboService(version = "v1.0.1", timeout = 3000)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", response from provider: " + RpcContext.getServiceContext().getLocalAddress();
    }
}
