package com.av.services.imp;

import com.av.configuration.AppConfiguration;
import com.av.services.LocaleService;
import java.util.Locale;
import org.springframework.stereotype.Service;

@Service
public class LocaleServiceImpl implements LocaleService {

    private Locale locale;

    public LocaleServiceImpl(AppConfiguration configuration) {
        this.locale = configuration.getLocale();
    }

    @Override
    public void defineLocale(Locale newLocale) {
        this.locale = newLocale;
    }

    @Override
    public Locale getLocaleForSession() {
        return locale;
    }
}
