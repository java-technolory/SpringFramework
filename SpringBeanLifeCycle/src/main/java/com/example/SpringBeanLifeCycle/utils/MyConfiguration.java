package com.example.SpringBeanLifeCycle.utils;

import com.example.SpringBeanLifeCycle.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class MyConfiguration {

    private Environment environment;

/*
    @Bean(name = "person1", initMethod = "init", destroyMethod = "destroy")
    @Scope(value = "singleton")
    public Person person() {
        Person p = new Person("Phan Thi Mai", 23);
        return p;
    }
*/

    public String str(){
        return environment.getProperty("spring1.api");
    }
}
