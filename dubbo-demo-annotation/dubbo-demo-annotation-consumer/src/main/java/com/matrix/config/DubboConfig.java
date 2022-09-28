package com.matrix.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 14:59:19
 * @Version: v1.0.1
 * @Description: dubbo配置类
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.matrix.service.impl") // 开启dubbo，并扫描dubbo相关注解
@PropertySource(value = "classpath:dubbo/dubbo-consumer.properties") // 加载dubbo-consumer.properties配置文件
public class DubboConfig {
}
