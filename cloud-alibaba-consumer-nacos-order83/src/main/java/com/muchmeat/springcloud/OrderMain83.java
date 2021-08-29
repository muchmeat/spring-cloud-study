package com.muchmeat.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author muchmeat
 * @date 2021/8/29 15:20
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain83 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain83.class, args);
    }
}
