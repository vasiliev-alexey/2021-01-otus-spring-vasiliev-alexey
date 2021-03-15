package com.av.services;

import com.av.domain.TestCase;
import java.util.List;

public interface TestSystemService {
    List<TestCase> getTestList(int i);

    String formatTestCase(TestCase testCase);
}
