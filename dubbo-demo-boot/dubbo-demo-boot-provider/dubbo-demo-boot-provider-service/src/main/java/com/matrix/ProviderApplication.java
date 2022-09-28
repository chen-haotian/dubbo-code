package com.matrix;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Matrix
 * @Date: 2022-09-28 07:40:58
 * @Version: v1.0.2
 * @Description: 服务提供者启动类
 */
@EnableDubbo(scanBasePackages = "com.matrix.service.impl") // 开启dubbo的支持，扫描包下的dubbo注解
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
