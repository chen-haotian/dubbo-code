package com.matrix.service.impl;

import com.matrix.service.HelloService;
import com.matrix.service.MessageService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 15:08:47
 * @Version: v1.0.1
 * @Description: 服务消费者自己的业务接口实现类
 */
@Service(value = "messageService-one")
public class MessageServiceImpl implements MessageService {

    // 远程过程调用，通过@DubboReference注解来注入对应version的接口即可使用
    @Autowired
    @DubboReference(version = "v1.0.1")
    private HelloService helloService;

    @Override
    public String info(String name) {
        return helloService.sayHello(name);
    }
}
