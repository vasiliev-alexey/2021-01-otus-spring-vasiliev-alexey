package com.av;

import com.av.configuration.AppConfiguration;
import com.av.services.ExaminationService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration.class)
public class Application {

    private static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "go go ");
        var ctx = SpringApplication.run(Application.class, args);
        var examinationService = ctx.getBean("examinationService", ExaminationService.class);
        examinationService.takeExam();
    }
}
