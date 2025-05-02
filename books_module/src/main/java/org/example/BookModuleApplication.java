package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
//		(scanBasePackages = "org.example")
public class BookModuleApplication {

	public static void main(String[] args) {


		String strB = new String();
		SpringApplication.run(BookModuleApplication.class, args);
	}

}
