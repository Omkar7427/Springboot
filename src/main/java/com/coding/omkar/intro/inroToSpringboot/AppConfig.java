package com.coding.omkar.intro.inroToSpringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    Apple getApple() {
        return new Apple();
    }

}
