package com.matrix.config;

import org.apache.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: Matrix
 * @Date: 2022-09-27 14:24:24
 * @Version: v1.0.1
 * @Description: 注册中心配置类
 */
@Configuration
@PropertySource(value = {"classpath:nacos/nacos.properties"})
public class NacosRegistryConfig {

    /**
     * 用于加载nacos.properties配置文件的key-value属性
     */
    @Value("${nacoes.address}")
    private String registryAddress;

    /**
     * 配置Nacos注册中心
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(registryAddress);
        return registryConfig;
    }
}
