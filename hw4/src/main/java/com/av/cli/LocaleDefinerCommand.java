package com.av.cli;

import com.av.services.LocaleService;
import java.util.Locale;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class LocaleDefinerCommand {

    private final LocaleService localeService;

    public LocaleDefinerCommand(LocaleService localeService) {
        this.localeService = localeService;
    }

    @ShellMethod("set locale fo session")
    void defineLocale(String localeCode) {
        localeService.defineLocale(Locale.forLanguageTag(localeCode));
    }
}
