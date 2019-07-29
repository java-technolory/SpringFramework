package com.example.SpringDependencyInjection.consumer;

import com.example.SpringDependencyInjection.services.MessageService;

public class MyApplicationXML {

    private MessageService messageService;

    //constructor-based dependency injection
    public MyApplicationXML(MessageService msv) {
        this.messageService = msv;
    }

    //setter-based dependency injection
    public void setMessageService(MessageService msv) {
        this.messageService = msv;
    }

    public boolean processMessage(String msg, String rec) {
        return this.messageService.sendMessage(msg, rec);
    }
}
