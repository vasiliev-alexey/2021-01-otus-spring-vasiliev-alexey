package com.av.services.imp;

import com.av.configuration.AppConfiguration;
import com.av.services.UiService;
import java.util.Locale;
import java.util.Scanner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service("uiService")
public class UiConsoleServiceImpl implements UiService {

    private final MessageSource messageSource;
    private final Locale locale;

    public UiConsoleServiceImpl(MessageSource messageSource, AppConfiguration appConfiguration) {
        this.messageSource = messageSource;
        locale = appConfiguration.getLocale();
    }

    @Override
    public String input(String greeting) {
        var localeMsg = messageSource.getMessage(greeting, null, greeting, locale);

        Scanner scan = new Scanner(System.in);
        System.out.println(localeMsg);
        return scan.nextLine();
    }

    @Override
    public void output(String data) {
        System.out.println(data);
    }
}
