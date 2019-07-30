package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.stereotype.Component;

@Component(value = "barFormatter")
public class BarFormatter implements Formatter{
    @Override
    public String format() {
        return "bar";
    }
}
