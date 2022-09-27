package com.matrix.service.impl;

import com.matrix.service.HelloService;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 12:42:58
 * @Version: v1.0.0
 * @Description: HelloService的具体实现
 */
public class HelloServiceImpl implements HelloService {

    /**
     * sayHello()接口实现类
     *
     * @return String类型信息
     */
    @Override
    public String sayHello() {
        return "Hello Dubbo";
    }
}
