package com.example.spring.demo.lesson3example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

}
