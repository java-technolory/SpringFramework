package com.example.SpringBeanLifeCycle.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyService {

    @PostConstruct
    public void init() {
        System.err.println("MyService init method called");
    }

    public MyService() {
        System.err.println("MyService no-args constructor called");
    }

    @PreDestroy
    public void destroy() {
        System.err.println("MyService destroy method called");
    }
}
