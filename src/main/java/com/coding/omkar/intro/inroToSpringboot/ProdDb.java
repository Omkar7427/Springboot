package com.coding.omkar.intro.inroToSpringboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env", havingValue="production")
public class ProdDb implements Db {
    public String getData() {
        return "Prod Data";
    }
}
