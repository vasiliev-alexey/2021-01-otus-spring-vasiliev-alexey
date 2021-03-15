package com.av.services;

import static org.junit.jupiter.api.Assertions.*;

import com.av.domain.TestCase;
import com.av.services.imp.TestSuitePrinterImpl;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSuitePrinterImplTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void printTestSuite() {
        TestCase testCase = new TestCase();
        testCase.setId(0);
        testCase.setQuestion("why?");
        testCase.setRightAnswer((short) 1);

        var t = new TestSuitePrinterImpl();
        t.printTestSuite(Arrays.asList(testCase));

        assertEquals(
            "TestCase{id=0, question='why?', rightAnswer=1, answers=[]}",
            outputStreamCaptor.toString().trim()
        );
    }
}
