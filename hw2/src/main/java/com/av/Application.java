package com.av;

import com.av.domain.Student;
import com.av.services.ExaminationService;
import com.av.services.StudentService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class Application {

    private static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);

        var examinationService = ctx.getBean("examinationService", ExaminationService.class);

        var studentService = ctx.getBean("studentService", StudentService.class);
        examinationService.takeExam();

        logger.log(Level.INFO, "go go ");
    }
}
