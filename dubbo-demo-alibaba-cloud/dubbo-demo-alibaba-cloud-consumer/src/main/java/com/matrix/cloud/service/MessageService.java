package com.matrix.cloud.service;

/**
 * @Author: Matrix
 * @Date: 2022-10-01 11:28:22
 * @Version: v1.0.3
 * @Description: 消费者自己的业务接口【MessageService】
 */
public interface MessageService {

    /**
     * info详细
     *
     * @param name 名称
     * @return String的信息
     */
    String info(String name);
}
