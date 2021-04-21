package com.example.spring.demo.lesson1;

public class InitializingBean implements IInitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This method does some job.");
    }

    @Override
    public void beforeDelete() throws Exception {
        System.out.println("This method does job before deleting");
    }
}
