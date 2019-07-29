package com.example.SpringDependencyInjection.test;

import com.example.SpringDependencyInjection.consumer.MyApplicationXML;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientXMLApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyApplicationXML app = context.getBean(MyApplicationXML.class);
        app.processMessage("Hi Mai","maiphan07@gmail.com");

        //close the context
        context.close();
    }
}
