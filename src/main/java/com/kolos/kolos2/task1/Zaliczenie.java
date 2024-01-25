package com.kolos.kolos2.task1;

import java.time.LocalDate;

public class Zaliczenie {
private int grade;
private LocalDate date;
private  String subject;

    public Zaliczenie(int grade, LocalDate date, String subject) {
        this.grade = grade;
        this.date = date;
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
