package com.matrix.cloud.service;

/**
 * @Author: Matrix
 * @Date: 2022-10-01 10:43:01
 * @Version: v1.0.3
 * @Description: 服务提供者业务层接口
 */
public interface HelloService {

    /**
     * sayHello 方法
     *
     * @param name 名称
     * @return String类型信息
     */
    String sayHello(String name);
}
