package com.platform.neighbour.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NeighbourActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeighbourActivityApplication.class, args);
    }

}
