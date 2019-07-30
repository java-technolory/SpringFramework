package com.example.SpringBeanLifeCycle.aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAwareMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.getBean("myAwareService", MyAwareService.class);
        context.close();
    }
}
