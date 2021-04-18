package com.av;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.av.dao")
@EnableMongock
public class SpringDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }
}
