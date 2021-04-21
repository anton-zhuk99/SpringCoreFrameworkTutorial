package com.example.spring.demo.lesson3example2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:application.properties"),
        @PropertySource(value = "classpath:employee.properties")
})
public class BeansConfiguration {

    @Bean
    @Scope(value = "prototype")
    @Qualifier(value = "itDepartment")
    public Department departmentIt() {
        return new Department();
//        Department d = new Department();
//        d.setName("dlkmlds");
//        d.setAmountOfEmployees(123);
//        return d;
    }

    @Bean
    public Employee employee() {
        return new Employee();
    }

}