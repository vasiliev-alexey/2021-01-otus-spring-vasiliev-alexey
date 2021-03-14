package com.av.services.imp;

import com.av.services.LocaleService;
import com.av.services.UiService;
import java.util.Scanner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service("uiService")
public class UiConsoleServiceImpl implements UiService {

    private final MessageSource messageSource;
    private final LocaleService localeService;

    public UiConsoleServiceImpl(MessageSource messageSource, LocaleService localeService) {
        this.messageSource = messageSource;

        this.localeService = localeService;
    }

    @Override
    public String input(String greeting) {
        var localeMsg = messageSource.getMessage(greeting, null, greeting, localeService.getLocaleForSession());

        Scanner scan = new Scanner(System.in);
        System.out.println(localeMsg);
        return scan.nextLine();
    }

    @Override
    public void output(String data) {
        System.out.println(data);
    }
}
