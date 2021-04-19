package com.example.spring.demo;

public interface IInitializingBean {
    void afterPropertiesSet() throws Exception;
    void beforeDelete() throws Exception;
}
