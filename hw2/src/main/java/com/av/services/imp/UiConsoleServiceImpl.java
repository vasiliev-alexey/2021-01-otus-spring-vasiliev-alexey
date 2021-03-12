package com.av.services.imp;

import com.av.services.UiService;
import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service("uiService")
public class UiConsoleServiceImpl implements UiService {

    @Override
    public String input(String greeting) {
        Scanner scan = new Scanner(System.in);
        System.out.println(greeting);
        return scan.nextLine();
    }

    @Override
    public void output(String data) {
        System.out.println(data);
    }
}
