package com.example.spring.demo.lesson2example4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("xmlBeans/beans5.xml");
        Exam exam = context.getBean("examBean", Exam.class);
        System.out.println(exam.getSubject());
        exam.checkExam();

//        ExamChecker examChecker = new ExamChecker();
//        Exam exam = new Exam(examChecker, "Mathematics");
//        exam.checkExam();
    }


}
