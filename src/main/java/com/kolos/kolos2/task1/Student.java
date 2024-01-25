package com.kolos.kolos2.task1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private ArrayList<Zaliczenie> zaliczenia;//должно быть приватное, потому чтоту каждого студента своя оценка

    public Student(String name, String surname) {
        super(name, surname);
        this.zaliczenia = new ArrayList<>();
    }
    /*1. У нас есть челик, мы достаем его зачеты(через this) и присваиваем
2. Циклом проходимся, у каждого зачета достаем оценку, суммируем ее к сумме
3. Делим на количество зачетов и возвращаем это значение*/
public double middleGrade(){
    double sum = 0;
    ArrayList<Zaliczenie> zaliczenie =  this.getZaliczenia();
     for(int i = 0; i<zaliczenie.size();i++){
         sum += zaliczenie.get(i).getGrade();
     }
     sum = sum/zaliczenie.size();
     return sum;
}
    public void addZaliczenie(Zaliczenie zaliczenie) {
        zaliczenia.add(zaliczenie);
    }

    public void removeZaliczenie(Zaliczenie zaliczenie) {
        zaliczenia.remove(zaliczenie);
    }


    @Override
    public String toString() {
        return "Student{" +
                '}';
    }

    public ArrayList<Zaliczenie> getZaliczenia() {
        return zaliczenia;
    }

    public void setZaliczenia(ArrayList<Zaliczenie> zaliczenia) {
        this.zaliczenia = zaliczenia;
    }
}
