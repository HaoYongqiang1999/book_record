package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
//        (scanBasePackages = "org.example")
public class RecordsModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordsModuleApplication.class, args);
    }

}
