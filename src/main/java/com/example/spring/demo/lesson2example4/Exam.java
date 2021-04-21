package com.example.spring.demo.lesson2example4;

public class Exam {

    private ExamChecker checker;
    private String subject;

    public Exam(ExamChecker examChecker, String subject) {
        checker = examChecker;
        this.subject = subject;
    }

    public ExamChecker getChecker() {
        return checker;
    }

    public void setChecker(ExamChecker checker) {
        this.checker = checker;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void checkExam() {
        checker.checkExam();
    }
}
