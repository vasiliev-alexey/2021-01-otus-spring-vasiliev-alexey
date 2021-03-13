package com.av.services.imp;

import com.av.domain.TestCase;
import com.av.services.TestSuitePrinter;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TestSuitePrinterImpl implements TestSuitePrinter {

    public void printTestSuite(List<TestCase> testCaseList) {
        testCaseList.forEach(ts -> System.out.println(ts.toString()));
    }
}
