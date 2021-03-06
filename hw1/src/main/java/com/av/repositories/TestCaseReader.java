package com.av.repositories;

import com.av.domain.TestCase;
import java.io.FileNotFoundException;
import java.util.List;

public interface TestCaseReader {
    List<TestCase> GetTestCases();
}
