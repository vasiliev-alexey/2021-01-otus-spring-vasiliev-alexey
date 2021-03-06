package com.av.services;

import com.av.domain.TestCase;
import java.util.List;

public class TestSuitePrinterImpl implements TestSuitePrinter {

    public void PrintTestSuite(List<TestCase> testCaseList) {
        testCaseList.forEach(ts -> System.out.println(ts.toString()));
    }
}
