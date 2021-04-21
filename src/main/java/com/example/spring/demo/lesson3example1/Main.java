package com.example.spring.demo.lesson3example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("mixedBeans.xml");
        EmployeeSA employeeSA = context.getBean("employeeSA", EmployeeSA.class);
        EmployeeIT employeeIT = context.getBean("employeeIT", EmployeeIT.class);
        System.out.println(employeeSA);
        System.out.println(employeeIT);
        context.registerShutdownHook();
        // XML + Autowired + Qualifier (PostConstruct + PreDestroy)
    }

}
