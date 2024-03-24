package ru.practicum.main.service;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToLongConverter implements Converter<String, Long> {
    @Override
    public Long convert(String source) {
        if ("null".equalsIgnoreCase(source)) {
            return 0L;
        }
        return Long.valueOf(source);
    }
}
