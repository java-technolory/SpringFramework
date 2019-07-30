package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AService {
    @Autowired
    @FormatterType(value = "a")
    private Formatter formatter;
}
