package com.matrix.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 14:31:36
 * @Version: v1.0.1
 * @Description: 用于bean的扫描配置类
 */
@ComponentScan(basePackages = "com.matrix") // 需要扫描的包，用于加载bean配置
public class AnnotationScanConfig {

}
