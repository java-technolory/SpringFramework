package com.example.SpringIoC.service;

import java.util.Date;

public class MyService {
    public void log(String msg) {
        System.out.println(new Date() + " : " + msg);
    }
}
