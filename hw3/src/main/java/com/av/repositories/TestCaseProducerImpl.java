package com.av.repositories;

import com.av.configuration.AppConfiguration;
import com.av.domain.TestCase;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class TestCaseProducerImpl implements TestCaseProducer {

    private static Logger logger = Logger.getLogger(TestCaseProducerImpl.class.getName());

    private final DataReader dataReader;
    private final MessageSource messageSource;
    private Locale locale;

    public TestCaseProducerImpl(DataReader dataReader, MessageSource messageSource, AppConfiguration appConfiguration) {
        this.dataReader = dataReader;
        this.messageSource = messageSource;
        this.locale = appConfiguration.getLocale();
    }

    @Override
    public List<TestCase> getTestCases() {
        var testSuite = new ArrayList<TestCase>();

        var testDataList = dataReader.readData();

        testDataList.forEach(
            str -> {
                var testCase = parseTestSuitString(str);
                testSuite.add(testCase);
            }
        );

        return testSuite;
    }

    private TestCase parseTestSuitString(String testCode) {
        var testCase = new TestCase();

        String line = messageSource.getMessage(testCode, null, null, locale);

        var scanner = new Scanner(line);

        logger.log(Level.INFO, line);

        int index = 0;
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0) {
                    testCase.setId(Integer.parseInt(data));
                } else if (index == 1) {
                    testCase.setQuestion(data);
                } else if (index == 2) {
                    testCase.setRightAnswer(Short.parseShort(data));
                } else {
                    testCase.getAnswers().add(data);
                }
                index++;
            }
            index = 0;
        }

        return testCase;
    }
}
