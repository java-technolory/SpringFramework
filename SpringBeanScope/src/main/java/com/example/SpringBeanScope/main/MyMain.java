package com.example.SpringBeanScope.main;

import com.example.SpringBeanScope.bean.MyBean;
import com.example.SpringBeanScope.configuration.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        // c1
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        // c2
/*        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyConfiguration.class);
        context.refresh();*/

        MyBean bean1 = context.getBean(MyBean.class);
        System.err.println(bean1.hashCode());

        MyBean bean2 = context.getBean(MyBean.class);
        System.err.println(bean2.hashCode());

        context.close();
    }
}
