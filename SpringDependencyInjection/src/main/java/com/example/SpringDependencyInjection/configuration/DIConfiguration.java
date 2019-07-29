package com.example.SpringDependencyInjection.configuration;

import com.example.SpringDependencyInjection.consumer.MyApplication;
import com.example.SpringDependencyInjection.services.EmailService;
import com.example.SpringDependencyInjection.services.MessageService;
import com.example.SpringDependencyInjection.services.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Annotation Details
 * @Configuration : Annotation được sử dụng để cho Spring biết rằng  nó có một lớp cấu hình (Configuration Class)
 * @ComponentScan : Annotation được sử dụng với annotation @Configuration để chỉ định package cần tìm lớp thành phần (Component Class)
 * @Bean : Annotation được sử dụng để cho SpringFramework biết rằng method này nên được sử dụng để thực hiển Bean để Inject vào Component Class.
 */

@Configuration
//@ComponentScan(value = {"com.example.SpringDependencyInjection.consumer"})
@ComponentScan(basePackageClasses = MyApplication.class)
public class DIConfiguration {

    @Bean(value = "email")
    public MessageService getMessageService(){
        return new EmailService();
    }
}
