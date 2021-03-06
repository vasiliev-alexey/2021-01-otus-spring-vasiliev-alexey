package com.av.services;

import com.av.Application;
import com.av.repositories.TestCaseReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSystemServiceImpl implements TestSystemService {

    static Logger logger = Logger.getLogger(String.valueOf(Application.class));
    private TestCaseReader reader;
    private TestSuitePrinter printer;

    public TestSystemServiceImpl(TestCaseReader reader, TestSuitePrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    @Override
    public void PrintTestSuite() {
        var testSuite = reader.GetTestCases();

        if (testSuite != null && !testSuite.isEmpty()) {
            logger.log(Level.INFO, "Print test suite");
            printer.PrintTestSuite(testSuite);
        } else {
            logger.log(Level.INFO, "Empty on null test  collection");
        }
    }
}
