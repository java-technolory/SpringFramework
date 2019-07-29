package com.example.SpringBeanScope.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DataSesstionScope {
    private String name = "Sesstion Scope";

    public DataSesstionScope() {
        System.out.println("DataSesstionScope Constructor Called at " + LocalDateTime.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
