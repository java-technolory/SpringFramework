package com.example.SpringBeanLifeCycle.service;

import com.example.SpringBeanLifeCycle.bean.Employee;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeService implements InitializingBean, DisposableBean {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeService() {
        System.err.println("EmployeeService no-args constructor called");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("EmployeeService Closing Resource");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("EmployeeService initializing to dummy value");
        if (employee.getName() == null) {
            employee.setName("Hai");
        }
    }
}
