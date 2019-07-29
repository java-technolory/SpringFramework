package com.example.SpringDependencyInjection.services;

public class EmailService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.err.println("Email sent to " + rec + " with Message = " + msg);
        return true;
    }
}
