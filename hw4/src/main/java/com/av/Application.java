package com.av;

import com.av.configuration.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration.class)
public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "go go ");
        SpringApplication.run(Application.class, args);
    }
}
