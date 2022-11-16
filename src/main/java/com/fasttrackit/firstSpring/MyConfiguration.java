package com.fasttrackit.firstSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Engine myEngine() {
        return new Engine(200);
    }
}
