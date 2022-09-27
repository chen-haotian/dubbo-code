package com.matrix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 12:47:14
 * @Version: v1.0.0
 * @Description: 服务提供者启动类
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        // 加载dubbo-spring.xml配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-spring-provider.xml");
        context.start();
        System.in.read();
    }
}
