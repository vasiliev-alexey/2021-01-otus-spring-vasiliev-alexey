package com.av.services;

import com.av.domain.TestCase;
import java.util.List;

public interface TestSuitePrinter {
    void printTestSuite(List<TestCase> testCaseList);
}
