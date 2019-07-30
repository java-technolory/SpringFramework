package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {

    @Autowired
    @Qualifier(value = "fooFormatter")
    private Formatter formatter;

    public void show() {
        System.out.println(this.formatter.format());
    }
}
