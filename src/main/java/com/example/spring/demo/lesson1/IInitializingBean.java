package com.example.spring.demo.lesson1;

public interface IInitializingBean {
    void afterPropertiesSet() throws Exception;
    void beforeDelete() throws Exception;
}
