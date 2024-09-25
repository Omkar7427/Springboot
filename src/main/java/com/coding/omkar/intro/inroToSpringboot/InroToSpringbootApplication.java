package com.coding.omkar.intro.inroToSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InroToSpringbootApplication implements CommandLineRunner {
    @Autowired
    Apple apple1;
    @Autowired
    Apple apple2;
    @Autowired
    DbService dbservice;

    public static void main(String[] args) {
        SpringApplication.run(InroToSpringbootApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        apple1.eatApple();
        System.out.println(dbservice.getData());
    }
}
