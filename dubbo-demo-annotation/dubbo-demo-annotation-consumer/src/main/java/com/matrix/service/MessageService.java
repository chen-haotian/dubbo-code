package com.matrix.service;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 15:09:01
 * @Version: v1.0.1
 * @Description: 服务消费者自己的业务接口
 */
public interface MessageService {

    /**
     * 服务消费者自己的业务接口方法
     *
     * @param name 名称
     * @return
     */
    String info(String name);
}
