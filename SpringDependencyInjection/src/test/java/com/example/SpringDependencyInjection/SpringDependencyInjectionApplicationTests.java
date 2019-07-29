package com.example.SpringDependencyInjection;

import com.example.SpringDependencyInjection.consumer.MyApplication;
import com.example.SpringDependencyInjection.services.MessageService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
@ComponentScan(basePackageClasses = MyApplication.class)
public class SpringDependencyInjectionApplicationTests {

    private AnnotationConfigApplicationContext context = null;

    @Bean
    public MessageService getMessageService() {
        return new MessageService() {
            @Override
            public boolean sendMessage(String msg, String rec) {
                System.out.println("Mock Service");
                return true;
            }
        };
    }

    @Before
    public void setUp() {
        context = new AnnotationConfigApplicationContext(SpringDependencyInjectionApplication.class);
    }

    @After
    public void tearDown() {
        context.close();
    }

    @Test
    public void contextLoads() {
        MyApplication app = context.getBean(MyApplication.class);
        Assert.assertTrue(app.processMessage("Hi Tuan", "tuan@gmail.com"));
    }

}
