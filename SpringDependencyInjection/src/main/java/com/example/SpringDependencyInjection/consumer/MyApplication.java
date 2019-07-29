package com.example.SpringDependencyInjection.consumer;

import com.example.SpringDependencyInjection.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {
//    @Autowired
    private MessageService service;

//    @Autowired
//    public MyApplication(MessageService svc){
//        this.service = svc;
//    }

    @Autowired
    @Qualifier(value = "email")
    public void setService(MessageService svc){
        this.service = svc;
    }

    public boolean processMessage(String msg, String rec){
        return this.service.sendMessage(msg,rec);
    }
}
