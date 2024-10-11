package com.eazybytes.springsecoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.eazybytes")
public class SpringsecOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecOauth2Application.class, args);
    }

}
