package com.kolos.kolos2.task1;

import java.time.LocalDate;

public class UniversityTester {
    public static void main(String[] args) {
        UniversityServis tester = new UniversityServis();
        Teacher teacher = new Teacher("Ivanov", "Ivan");
        Teacher teacher1 = new Teacher("Nowak", "Ivan");
        Student student = new Student("Petr", "Vasiljev");
        Student student1 = new Student("Nikita", "Kovalski");
        Zaliczenie zaliczenie = new Zaliczenie(5, LocalDate.of(2023, 2, 20), "math");
        Zaliczenie zaliczenie1 = new Zaliczenie(4, LocalDate.of(2023, 2, 10), "logiks");
        Zaliczenie zaliczenie2 = new Zaliczenie(5, LocalDate.of(2023, 2, 10), "fiziks");
        student.addZaliczenie(zaliczenie);
        student1.addZaliczenie(zaliczenie1);
        student1.addZaliczenie(zaliczenie2);
        teacher.addKurs("math");
        teacher1.addKurs("fiziks");
        teacher.addKurs("logiks");
        tester.addStudent(student);
        tester.addStudent(student1);
        tester.addTeacher(teacher);
        tester.addTeacher(teacher1);
        tester.showListOfTeachers();
        tester.showListOfStudents();

    }


}