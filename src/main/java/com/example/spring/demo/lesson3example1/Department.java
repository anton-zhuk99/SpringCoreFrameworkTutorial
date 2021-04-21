package com.example.spring.demo.lesson3example1;

public class Department {

    private String name;
    private int amountOfEmployees;

    public Department() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfEmployees() {
        return amountOfEmployees;
    }

    public void setAmountOfEmployees(int amountOfEmployees) {
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
