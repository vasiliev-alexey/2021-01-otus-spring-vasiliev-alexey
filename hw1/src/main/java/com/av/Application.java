package com.av;

import com.av.repositories.TestCaseReader;
import com.av.services.TestSystemService;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.ResourceUtils;

public class Application {

    static Logger logger = Logger.getLogger(String.valueOf(Application.class));

    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("./App.xml");
        var testSystemService = ctx.getBean("testSystemService", TestSystemService.class);

        testSystemService.PrintTestSuite();

        logger.info("go go ");
    }
}
