package com.example.spring.demo;

public class Message {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Bean is initializing.");
    }

    public void destroy() {
        System.out.println("Bean is destroying.");
    }
}
