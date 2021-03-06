package com.av.repositories;

import com.av.domain.TestCase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class TestCaseReaderImpl implements TestCaseReader {

    private static Logger logger = Logger.getLogger(TestCaseReaderImpl.class.getName());

    private String fileName;

    @Value("${testSuit.fileName}")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<TestCase> getTestCases() {
        var testSuite = new ArrayList<TestCase>();

        var testDataList = readFile();

        testDataList.forEach(
            str -> {
                var testCase = parseTestSuitString(str);
                testSuite.add(testCase);
            }
        );

        return testSuite;
    }

    private List<String> readFile() {
        var testDataList = new ArrayList<String>();

        try {
            var inputStreamReader = new InputStreamReader(
                new ClassPathResource(fileName, this.getClass().getClassLoader()).getInputStream()
            );
            var reader = new BufferedReader(inputStreamReader);
            String line;

            int rowCount = 0;

            while ((line = reader.readLine()) != null) {
                rowCount += 1;
                if (rowCount == 1) {
                    continue;
                }
                testDataList.add(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testDataList;
    }

    private TestCase parseTestSuitString(String line) {
        var testCase = new TestCase();
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
