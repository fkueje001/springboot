package com.example.server.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : nangua
 * date:   2018-07-02 09:56
 * @description:
 */
@Configuration
public class RestConfig {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;


    @Bean

    public RestTemplate restTemplate(){
        return restTemplateBuilder.build();
    }



}