package com.cloudblitz.vacancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PropertySource("classpath:application.properties") // Ensures properties file is loaded
public class CareerSiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(CareerSiteApplication.class, args);
    }
}
