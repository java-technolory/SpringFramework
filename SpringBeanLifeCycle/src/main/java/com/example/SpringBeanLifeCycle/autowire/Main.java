package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Main {

    @Autowired
    private static FooService fooService;

    public static void main(String[] args) {
        fooService.show();
    }
}
