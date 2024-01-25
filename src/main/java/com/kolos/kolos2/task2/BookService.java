package com.kolos.kolos2.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BookService {
    public static ArrayList<Book> books = new ArrayList<>();

    public void makeFile() throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/kolos/kolos2/task2/file1"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/kolos/kolos2/task2/file2"))) {
            double t;
            String line;
            br.readLine();
            bw.write(String.format("%-20s%-20s%-20s%-20s%-20s%n", "Autor", "Tytul", "Ilosc", "Cena", "Wartosc"));
            while ((line = br.readLine()) != null) {
                String[] res = line.split("\\s+");
                Book book = new Book();
                book.setTitul(res[0]);
                book.setAutor(res[1] + res[2]);
                book.setIlosc(Double.parseDouble(res[3]));
                book.setCena(Double.parseDouble(res[4]));
                t = book.getIlosc() * book.getCena();
                book.setWartosc(t);
                books.add(book);
            }
            Collections.sort(books);

        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() throws Exception{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/kolos/kolos2/task2/file2"));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter("src/main/java/com/kolos/kolos2/task2/filezerowy"))) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getIlosc() != 0) {
                    bw.write(String.format("%-20s%-20s%-20s%-20s%-20s%n", books.get(i).getTitul(), books.get(i).getAutor(), books.get(i).getIlosc(), books.get(i).getCena(), books.get(i).getWartosc()));


                } else {
                    bw1.write(String.format("%-20s%-20s%-20s%n", books.get(i).getTitul(), books.get(i).getAutor(), books.get(i).getIlosc()));
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
