package com.example.SpringBeanLifeCycle.service;

import com.example.SpringBeanLifeCycle.bean.Employee;

public class MyEmployeeService {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public MyEmployeeService() {
        System.err.println("MyEmployeeService no-args constructor called");
    }

    //pre-destroy method
    public void destroy() {
        System.err.println("MyEmployeeService Closing resources");
    }

    //post-init method
    public void init() {
        System.err.println("MyEmployeeService initializing to dummy value");
        if (employee.getName() == null) {
            employee.setName("Hai");
        }
    }
}
