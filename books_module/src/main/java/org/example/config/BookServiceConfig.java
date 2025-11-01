package org.example.config;

import feign.Logger;
import org.haotest.service.TestTableService;
import org.haotest.service.impl.TestTableServiceImpl;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BookServiceConfig {
    @LoadBalanced
    @Bean
    public RestTemplate myrestTemplate() {
        return new RestTemplate();
    }
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }


}
