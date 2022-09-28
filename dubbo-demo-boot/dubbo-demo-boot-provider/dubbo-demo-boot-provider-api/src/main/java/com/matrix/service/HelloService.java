package com.matrix.service;

/**
 * @Author: Matrix
 * @Date: 2022-09-28 08:55:10
 * @Version: v1.0.2
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
