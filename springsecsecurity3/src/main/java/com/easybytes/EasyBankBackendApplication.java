package com.easybytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@EnableJpaRepositories("com.easybytes.repository")
//@EntityScan("com.easybytes.model")
@EnableWebSecurity
public class EasyBankBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyBankBackendApplication.class, args);
    }

}
