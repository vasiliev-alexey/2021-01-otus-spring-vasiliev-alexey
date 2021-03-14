package com.av.services;

import java.util.Locale;

public interface LocaleService {
    void defineLocale(Locale locale);

    Locale getLocaleForSession();
}
