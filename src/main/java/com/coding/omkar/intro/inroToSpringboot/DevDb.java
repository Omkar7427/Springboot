package com.coding.omkar.intro.inroToSpringboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name="deploy.env", havingValue="development")
public class DevDb implements Db{
   public String getData() {
        return "Dev Data";
    }

}