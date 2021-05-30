package com.raynermdz.raynermendezportfolioserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties", "classpath:database.properties"})
public class RaynerMendezPortfolioServerApplication implements CommandLineRunner {

    @Value("${spring.profiles.active}")
    private String pathToJavaFx;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.pathToJavaFx);
    }

    public static void main(String[] args) {
        SpringApplication.run(RaynerMendezPortfolioServerApplication.class, args);
    }

}
