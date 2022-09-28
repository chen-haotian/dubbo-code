package com.matrix;

import com.matrix.config.AnnotationScanConfig;
import com.matrix.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 14:52:23
 * @Version: v1.0.1
 * @Description: 服务消费者启动类
 */
public class ConsumerApplication {
    public static void main(String[] args) {
        // 使用注解的方式加载
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationScanConfig.class);
        MessageService messageService = (MessageService) applicationContext.getBean("messageService-one");
        String info = messageService.info("Matrix");
        // 打印服务消费者消费的信息
        System.out.println(info);
    }
}
