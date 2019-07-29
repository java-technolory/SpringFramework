package com.example.SpringBeanScope.configuration;

import com.example.SpringBeanScope.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = MyBean.class)
public class MyConfiguration {
/*
    @Bean
    @Scope(value = "singleton")
    public MyBean bean1() {
        return new MyBean();
    }
*/

/*
    @Bean
    @Scope(value = "prototype")
    public MyBean bean2() {
        return new MyBean();
    }

*/

    @Bean
    @Scope(value = "request")
    public MyBean bean3() {
        return new MyBean();
    }

}
