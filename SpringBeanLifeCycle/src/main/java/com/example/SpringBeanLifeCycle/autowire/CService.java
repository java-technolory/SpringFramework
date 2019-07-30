package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CService {

    @Autowired
    @FormatterType(value = "c")
    private Formatter formatter;
}
