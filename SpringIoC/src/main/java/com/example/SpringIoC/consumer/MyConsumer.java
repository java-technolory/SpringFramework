package com.example.SpringIoC.consumer;

import com.example.SpringIoC.beans.MyBean;
import com.example.SpringIoC.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component
//@Controller
//@Service
//@Configuration
public class MyConsumer {

    //    @Autowired
    private MyService myService;

    @Autowired
    public MyConsumer(MyService myService) {
        this.myService = myService;
    }

    //    @Autowired
    public void setMyBean(MyService myService) {
        this.myService = myService;
    }
}
