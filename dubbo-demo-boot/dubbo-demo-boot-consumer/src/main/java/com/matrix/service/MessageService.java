package com.matrix.service;

/**
 * @Author: Matrix
 * @Date: 2022-09-28 09:11:44
 * @Version: v1.0.2
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
