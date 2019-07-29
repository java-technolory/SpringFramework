package com.example.SpringDependencyInjection.services;

public class TwitterService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.err.println("Twitter message sent to " + rec + " with Message = " + msg);
        return true;
    }
}
