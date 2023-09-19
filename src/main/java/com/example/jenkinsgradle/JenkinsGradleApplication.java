package com.example.jenkinsgradle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsGradleApplication.class, args);
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Jenkins Gradle");
            }
        };
    }

}
