package com.example.SpringBeanLifeCycle.utils;

import com.example.SpringBeanLifeCycle.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class MyConfiguration {
    @Bean(name = "person1", initMethod = "init", destroyMethod = "destroy")
    @Scope(value = "prototype")
    public Person person() {
        Person p = new Person("Phan Thi Mai", 23);
        return p;
    }
}
