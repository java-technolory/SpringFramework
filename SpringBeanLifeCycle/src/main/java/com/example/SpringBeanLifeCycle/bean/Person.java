package com.example.SpringBeanLifeCycle.bean;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //init
    public void init() {
        System.out.println("Bean init.");
    }

    public void destroy() {
        System.out.println("Bean destroy");
    }
}
