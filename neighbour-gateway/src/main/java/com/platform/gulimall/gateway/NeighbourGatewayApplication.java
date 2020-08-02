package com.platform.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1,工启服务注册发现功能
 * 2,配置nacos服务地址
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NeighbourGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeighbourGatewayApplication.class, args);
    }

}
