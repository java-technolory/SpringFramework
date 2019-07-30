package com.example.SpringBeanLifeCycle.configuration;

import com.example.SpringBeanLifeCycle.bean.Order;
import com.example.SpringBeanLifeCycle.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

    @Primary
    @Bean(name = "myPerson1")
    @Scope(value = "singleton")
    public Person myPerson1() {
        return new Person("Phan Hai", 22);
    }

    @Bean(name = "myPerson2")
    @Scope(value = "singleton")
    public Person myPerson2() {
        return new Person("Phan Mai", 23);
    }

    @Bean(name = "myOrder1")
    @Autowired
    @Qualifier(value = "myPerson1")
    public Order myOrder1(Person person) {
        return new Order(person);
    }

    @Bean(name = "myOrder2")
    @Autowired
    @Qualifier(value = "myPerson2")
    public Order myOrder2(Person person) {
        return new Order(person);
    }


}
