package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.stereotype.Component;

@Component(value = "fooFormatter")
public class FooFormatter implements Formatter {
    @Override
    public String format() {
        return "foo";
    }
}
