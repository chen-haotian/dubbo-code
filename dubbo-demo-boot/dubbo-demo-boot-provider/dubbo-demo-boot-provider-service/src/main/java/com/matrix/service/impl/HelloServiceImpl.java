package com.matrix.service.impl;

import com.matrix.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @Author: Matrix
 * @Date: 2022-09-28 08:56:42
 * @Version: v1.0.2
 * @Description: HelloService的具体实现
 */
@DubboService(version = "v1.0.2", timeout = 3000, protocol = "dubbo")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
