package com.av.repositories;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.util.AssertionErrors.assertEquals;

import java.util.Locale;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;

@SpringBootTest
class TestCaseReaderTest {

    @Autowired
    ApplicationContext context;

    @MockBean
    MessageSource messageSource;

    @MockBean
    DataReader dataReader;

    @Test
    void getTestCases() {
        Mockito.when(dataReader.readData()).thenReturn(Lists.list("1"));

        Mockito
            .when(
                messageSource.getMessage(
                    anyString(),
                    Mockito.nullable(Object[].class),
                    Mockito.nullable(String.class),
                    any(Locale.class)
                )
            )
            .thenReturn("5,Who killed Laura Palmer?,1,Harold,Her father,Leo Johnson");

        TestCaseProducer testCaseProducer = context.getBean(TestCaseProducer.class);
        var testList = testCaseProducer.getTestCases();
        assertEquals("test suit not loaded", 1, testList.size());
    }
}
