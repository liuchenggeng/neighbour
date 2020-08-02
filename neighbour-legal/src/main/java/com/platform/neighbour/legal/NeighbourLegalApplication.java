package com.platform.neighbour.legal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NeighbourLegalApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeighbourLegalApplication.class, args);
    }

}
