package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.stereotype.Component;

@FormatterType(value = "a")
@Component
public class AFormater implements Formatter {
    @Override
    public String format() {
        return null;
    }
}
