package com.matrix.cloud;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Matrix
 * @Date: 2022-10-01 10:44:25
 * @Version: v1.0.3
 * @Description: 服务提供者启动类
 */
@EnableDiscoveryClient // 注解表明是一个 Nacos 客户端，该注解是 Spring Cloud 提供的原生注解
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
