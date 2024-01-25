package com.kolos.kolos2.task1;

import java.util.ArrayList;

public class UniversityServis {
    /*Класс для обработки списка людей (студентов и преподавателей), включающий методы: -
   добавление человека в список, - отображение преподавателей со списком курсов. -
   отображение студентов со списком курсов и оценок, - отображение студентов со средней оценкой,
   - отображение средней оценки всех студентов, Тестовый класс, иллюстрирующий, как работает программа.*/
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showListOfTeachers() {
        for (Teacher t: teachers) {
            System.out.println(String.format("%-8s%-8s%-8s", t.getName(), t.getSurname(),t.getKursy() ));

        }
    }

    public void showListOfStudents() {
        for (Student s: students) {
            System.out.println(String.format("%-8s%-10s%-8s", s.getName(), s.getSurname(), s.middleGrade()));
            for (Zaliczenie e: s.getZaliczenia()) {
                System.out.println(String.format("%-8s%-8s%n", e.getSubject(), e.getGrade() ));
            }
        }
    }
}
