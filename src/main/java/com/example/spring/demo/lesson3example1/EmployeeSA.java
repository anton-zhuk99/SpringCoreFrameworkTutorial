package com.example.spring.demo.lesson3example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeSA extends Employee {

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    @Autowired
    @Qualifier(value = "departmentSA")
    public void setDepartment(Department department) {
        super.setDepartment(department);
    }

}
