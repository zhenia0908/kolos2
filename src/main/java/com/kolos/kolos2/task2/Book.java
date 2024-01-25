package com.kolos.kolos2.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Book implements Comparable<Book> {
   private ArrayList<String> res1 = new ArrayList<>();
  private   String titul;
  private   String autor;
   private Double ilosc;
   private Double wartosc;
   private Double cena;




    public Book(String titul, String autor, Double ilosc, Double cena) {
            this.res1 = res1;
            this.titul = titul;
            this.autor = autor;
            this.ilosc = ilosc;
            this.cena = cena;
            this.wartosc = wartosc;
        }

    public Book() {
        }

    public Double getWartosc() {
        return wartosc;
    }

    public void setWartosc(Double wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "res1=" + res1 +
                ", titul='" + titul + '\'' +
                ", autor='" + autor + '\'' +
                ", ilosc=" + ilosc +
                ", wartosc=" + wartosc +
                ", cena=" + cena +
                '}';
    }

    public String getTitul () {
            return titul;
        }

        public void setTitul (String titul){
            this.titul = titul;
        }

        public String getAutor () {
            return autor;
        }

        public void setAutor (String autor){
            this.autor = autor;
        }

        public Double getIlosc () {
            return ilosc;
        }

        public void setIlosc (Double ilosc){
            this.ilosc = ilosc;
        }


        public Double getCena () {
            return cena;
        }

        public void setCena (Double cena){
            this.cena = cena;
        }


    @Override
    public int compareTo(Book o) {
        return o.getIlosc().compareTo(this.ilosc);
    }
}
