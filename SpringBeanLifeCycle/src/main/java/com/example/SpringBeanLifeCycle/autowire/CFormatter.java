package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.stereotype.Component;

@FormatterType(value = "c")
@Component
public class CFormatter implements Formatter {
    @Override
    public String format() {
        return null;
    }
}
