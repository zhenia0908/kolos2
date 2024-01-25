package com.kolos.kolos2.lab14.task1;

public class Square {
    private Coordinate c1;
    private Coordinate c2;
    private Coordinate c3;
    private Coordinate c4;

    public Square(Coordinate c1, Coordinate c2,Coordinate c3,Coordinate c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public Coordinate getC1() {
        return c1;
    }

    public void setC1(Coordinate c1) {
        this.c1 = c1;
    }

    public Coordinate getC2() {
        return c2;
    }

    public void setC2(Coordinate c2) {
        this.c2 = c2;
    }

    public Coordinate getC3() {
        return c3;
    }

    public void setC3(Coordinate c3) {
        this.c3 = c3;
    }

    public Coordinate getC4() {
        return c4;
    }

    public void setC4(Coordinate c4) {
        this.c4 = c4;
    }
}
