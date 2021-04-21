package com.example.spring.demo.lesson1;

public class Message {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("I'm in init-method");
    }

    public void destroy() {
        System.out.println("I'm in destroy-method");
    }
}
