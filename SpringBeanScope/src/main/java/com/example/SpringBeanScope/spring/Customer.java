package com.example.SpringBeanScope.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    private DataRequestScope dataRequestScope;

    @Autowired
    private DataSesstionScope dataSesstionScope;

    public DataRequestScope getDataRequestScope() {
        return dataRequestScope;
    }

    public void setDataRequestScope(DataRequestScope dataRequestScope) {
        this.dataRequestScope = dataRequestScope;
    }

    public DataSesstionScope getDataSesstionScope() {
        return dataSesstionScope;
    }

    public void setDataSesstionScope(DataSesstionScope dataSesstionScope) {
        this.dataSesstionScope = dataSesstionScope;
    }
}
