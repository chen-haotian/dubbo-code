package com.matrix;

import com.matrix.config.AnnotationScanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 14:30:19
 * @Version: v1.0.1
 * @Description: 服务提供者启动类
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        // 使用注解的方式加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScanConfig.class);
        context.start();
        System.in.read();
    }
}
