package com.matrix.service.impl;

import com.matrix.service.HelloService;
import com.matrix.service.MessageService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Author: Matrix
 * @Date: 2022-09-28 09:12:57
 * @Version: v1.0.2
 * @Description: 消费者自己的业务接口实现类【MessageService】
 */
@Service(value = "messageService-one")
public class MessageServiceImpl implements MessageService {

    // 注入远程过程调用的接口【也就是服务提供者提供的API接口】
    @DubboReference(version = "v1.0.2")
    private HelloService helloService;

    @Override
    public String info(String name) {
        return helloService.sayHello(name);
    }
}
