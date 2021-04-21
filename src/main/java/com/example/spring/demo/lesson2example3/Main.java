package com.example.spring.demo.lesson2example3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("xmlBeans/beans4.xml");
        CollectionInjection coll = context.getBean("collectionsBean", CollectionInjection.class);
        System.out.println(coll.getList().toString());
        System.out.println(coll.getMap().toString());
        System.out.println(coll.getSet().toString());
        System.out.println(coll.getProps().toString());
    }

}
