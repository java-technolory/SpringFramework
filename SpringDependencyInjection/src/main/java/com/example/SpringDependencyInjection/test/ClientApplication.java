package com.example.SpringDependencyInjection.test;

import com.example.SpringDependencyInjection.configuration.DIConfiguration;
import com.example.SpringDependencyInjection.consumer.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);
        app.processMessage("Hi Hai","hajphan07@gmail.com");
        context.close();
    }
}
