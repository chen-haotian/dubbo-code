package com.matrix;

import com.matrix.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 12:50:04
 * @Version: v1.0.0
 * @Description: 服务消费者Application类
 */
public class ConsumerApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/dubbo-spring-consumer.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        String sayHello = helloService.sayHello();
        System.out.println(sayHello);
    }
}
