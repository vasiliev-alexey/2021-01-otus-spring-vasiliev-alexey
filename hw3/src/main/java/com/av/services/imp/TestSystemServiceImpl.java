package com.av.services.imp;

import com.av.Application;
import com.av.configuration.AppConfiguration;
import com.av.domain.TestCase;
import com.av.repositories.TestCaseProducer;
import com.av.services.TestSuitePrinter;
import com.av.services.TestSystemService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component("testSystemService")
public class TestSystemServiceImpl implements TestSystemService {

    private static Logger logger = Logger.getLogger(Application.class.getName());
    private final TestCaseProducer reader;
    private final TestSuitePrinter printer;
    private final MessageSource messageSource;
    private static final int GEN_SIZE = 100;
    private final Locale locale;

    @Autowired
    public TestSystemServiceImpl(
        final TestCaseProducer reader,
        final TestSuitePrinter printer,
        MessageSource messageSource,
        AppConfiguration configuration
    ) {
        this.reader = reader;
        this.printer = printer;
        this.messageSource = messageSource;
        this.locale = configuration.getLocale();
    }

    @Override
    public List<TestCase> getTestList(final int i) {
        var testSuite = reader.getTestCases();

        var retList = new ArrayList<TestCase>();
        var rndNums = new Random().ints(i * GEN_SIZE, 0, testSuite.size()).distinct().limit(i);

        rndNums.forEach(
            r -> {
                retList.add(testSuite.get(r));
            }
        );

        return retList;
    }

    @Override
    public String formatTestCase(TestCase testCase) {
        final String[] answers = { "" };
        final int[] i = { 1 };

        testCase.getAnswers().forEach(a -> answers[0] = String.format("%s\r\n%d. %s", answers[0], i[0]++, a));
        return testCase.getQuestion() + answers[0];
    }
}
