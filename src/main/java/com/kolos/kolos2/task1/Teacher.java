package com.kolos.kolos2.task1;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> kursy ;
    public Teacher(String name, String surname) {

        super(name, surname);
        this.kursy = new ArrayList<>();
    }

    public void addKurs(String kurs) {
        kursy.add(kurs);
    }

    public void removeKurs(String kurs) {
        kursy.remove(kurs);
    }

    public ArrayList<String> getKursy() {
        return kursy;
    }

    public void setKursy(ArrayList<String> kursy) {
        this.kursy = kursy;
    }
}
