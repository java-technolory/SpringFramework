package com.example.SpringBeanLifeCycle.controller;

import com.example.SpringBeanLifeCycle.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @Autowired
    @Qualifier(value = "myPerson2")
    private Person person;

    @GetMapping(value = "/bean")
    public Person home() {
        return this.person;
    }
}
