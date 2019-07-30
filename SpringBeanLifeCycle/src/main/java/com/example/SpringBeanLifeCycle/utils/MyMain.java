package com.example.SpringBeanLifeCycle.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class MyMain {

    @Autowired
    private static Environment environment;

    public static void main(String[] args) {
        System.out.println(environment.getProperty("message"));
    }
}
