package com.example.spring.demo.lesson3example2;

import org.springframework.beans.factory.annotation.Value;

public class Department {

    @Value(value = "${department.name}")
    private String name;
    @Value(value = "${department.amount}")
    private Integer amountOfEmployees;

    public Department() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountOfEmployees() {
        return amountOfEmployees;
    }

    public void setAmountOfEmployees(Integer amountOfEmployees) {
        this.amountOfEmployees = amountOfEmployees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", amountOfEmployees=" + amountOfEmployees +
                '}';
    }
}
