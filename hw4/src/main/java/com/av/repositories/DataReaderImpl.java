package com.av.repositories;

import com.av.configuration.AppConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class DataReaderImpl implements DataReader {

    private final AppConfiguration appConfiguration;

    public DataReaderImpl(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    @Override
    public List<String> readData() {
        var testDataList = new ArrayList<String>();

        try {
            var inputStreamReader = new InputStreamReader(
                new ClassPathResource(appConfiguration.getDataPath(), this.getClass().getClassLoader()).getInputStream()
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
}
