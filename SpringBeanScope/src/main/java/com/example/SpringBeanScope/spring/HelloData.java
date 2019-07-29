package com.example.SpringBeanScope.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloData {

    @Autowired
    private Customer customer;

    @RequestMapping(value = "/nameRS")
    public String helloRS() {
        return this.customer.getDataRequestScope().getName();
    }

    @RequestMapping(value = "/nameSS")
    public String helloSS() {
        return this.customer.getDataSesstionScope().getName();
    }

    @RequestMapping(value = "/nameSSUpdated")
    public String helloSSUpdated() {
        this.customer.getDataSesstionScope().setName("Sesstion Scope Updated");
        return this.customer.getDataSesstionScope().getName();
    }
}
