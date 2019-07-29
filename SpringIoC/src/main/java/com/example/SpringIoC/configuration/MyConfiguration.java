package com.example.SpringIoC.configuration;

import com.example.SpringIoC.beans.MyBean;
import com.example.SpringIoC.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(value = "com.example.SpringIoC.configuration")
@ComponentScan(basePackageClasses = MyConfiguration.class)
public class MyConfiguration {
    @Bean
    public MyService getMyService() {
        return new MyService();
    }
}
