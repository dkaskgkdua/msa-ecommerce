package com.example.msaecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaEcommerceApplication.class, args);
    }

}
