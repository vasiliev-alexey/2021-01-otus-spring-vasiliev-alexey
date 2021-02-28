package com.av.repositories;

import com.av.domain.TestCase;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.util.ResourceUtils;

public class TestCaseReaderImpl implements TestCaseReader {

    static Logger logger = Logger.getLogger(String.valueOf(TestCaseReaderImpl.class));

    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<TestCase> GetTestCases() {
        var testSuite = new ArrayList<TestCase>();
        try {
            var file = ResourceUtils.getFile(fileName);
            var reader = new BufferedReader(new FileReader(file));
            String line;

            int rowCount = 0;

            while ((line = reader.readLine()) != null) {
                rowCount += 1;
                if (rowCount == 1) {
                    continue;
                }

                var scanner = new Scanner(line);

                logger.log(Level.INFO, line);
                int index = 0;
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    var testCase = new TestCase();

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
                    testSuite.add(testCase);
                }
            }
            reader.close();

            return testSuite;
        } catch (IOException e) {
            logger.log(Level.INFO, String.format("Error in processing file %s", fileName), e);
        }

        return null;
    }
}
