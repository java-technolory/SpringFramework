package com.example.SpringBeanLifeCycle.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BarService {
    @Autowired
    @Qualifier(value = "barFormatter")
    private Formatter formatter;
}
