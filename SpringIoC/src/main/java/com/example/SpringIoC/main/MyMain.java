package com.example.SpringIoC.main;

import com.example.SpringIoC.configuration.MyConfiguration;
import com.example.SpringIoC.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Container (IoC Container)
 */

public class MyMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyService service = context.getBean(MyService.class);

        service.log("xin chao!");

        MyService newService = context.getBean(MyService.class);

        System.out.println("service hashcode = " + service.hashCode());
        System.out.println("new service hashcode = " + newService.hashCode());

        context.close();
    }
}
