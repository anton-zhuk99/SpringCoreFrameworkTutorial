package com.example.spring.demo.lesson2example2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beans3.xml");
        RandomIntArrayGenerator arrayGenerator = (RandomIntArrayGenerator) context.getBean("randomArrGen");
        int[] arr = arrayGenerator.getIntArray();
        System.out.println(Arrays.toString(arr));
    }

}
