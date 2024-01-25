package com.kolos.kolos2.task2;

public class BookTester {
    public static void main(String[] args) throws Exception {
        BookService tester = new BookService();
        tester.makeFile();
        tester.writeToFile();
    }
}
