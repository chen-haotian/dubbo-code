package com.matrix.cloud.service.impl;

import com.matrix.cloud.service.HelloService;
import com.matrix.cloud.service.MessageService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Author: Matrix
 * @Date: 2022-10-01 11:28:54
 * @Version: v1.0.3
 * @Description: 消费者自己的业务接口实现类【MessageService】
 */
@Service(value = "messageService-one")
public class MessageServiceImpl implements MessageService {

    // 注入远程过程调用的接口【也就是服务提供者提供的API接口】
    @DubboReference(version = "v1.0.3")
    private HelloService helloService;

    @Override
    public String info(String name) {
        return helloService.sayHello(name);
    }
}
