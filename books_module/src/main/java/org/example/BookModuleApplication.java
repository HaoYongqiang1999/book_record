package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
//		(scanBasePackages = "org.example")
public class BookModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookModuleApplication.class, args);
	}

}
