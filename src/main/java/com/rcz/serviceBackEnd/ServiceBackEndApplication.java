package com.rcz.serviceBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ServiceBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBackEndApplication.class, args);
    }

}
