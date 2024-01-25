package com.kolos.kolos2.lab14.task1;

import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task1 {
    /*А. Для заданного диапазона сгенерируйте n пар целых чисел и сохраните их в текстовый файл по следующей схеме:
Количество точек: n
х у
2 1
-3 5
.............
Эти данные будут рассматриваться как координаты n точек на плоскости в системе координат XOY.
Б. Прочитайте данные из файла и по ним определите (с помощью евклидовой метрики):
1. точка, наиболее удаленная от начала системы координат,(плюс расстояние везде понаходить)
2. координаты вершин прямоугольника с минимально возможной площадью поверхности и сторонами
 параллельно оси, в поле которой будут все точки множества P,
3. пара точек, наиболее удаленных друг от друга,
4. упорядоченный набор точек в порядке увеличения расстояний этих точек от начала системы.
 координаты,
Сохраните результаты в читаемом виде в другой текстовый файл.*/
    public static final int xBoard = 10;
    public static final int yBoard = 12;
    public static double d;
    public  static ArrayList<Coordinate>coordinates2 = new ArrayList<>();
    public static int howManyPoints = 45;
    public static double s;
    public static ArrayList<Coordinate> coordinate = new ArrayList<>();
    public static HashMap<Square, Double> squares = new HashMap<>();
    public static HashMap<Coordinate, Double> length = new HashMap<>();

    public static void main(String[] args) throws Exception {
        task1 tester = new task1();
        Random random = new Random();
        for (int i = 0; i < howManyPoints; i++) {
            int x = random.nextInt(xBoard + 1);
            int y = random.nextInt(yBoard + 1);
            Coordinate c1 = new Coordinate(x, y);
            coordinate.add(c1);
        }
        tester.countMaxDestination();
        coordinates2.add(new Coordinate (4.0, 11.0));
        coordinates2.add(new Coordinate (3.0, 7.0));
        coordinates2.add(new Coordinate (6.0, 7.0));
        coordinates2.add(new Coordinate (8.0, 11.0));
        coordinates2.add(new Coordinate (4.0, 4.0));
        coordinates2.add(new Coordinate (8.0, 4.0));
        tester.square();
    }

    public void countMaxDestination() throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/kolos/kolos2/lab14/task1/file"))) {
            for (int i = 0; i < coordinate.size(); i++) {
                bw.write(String.format("%-8s%-8s%n", coordinate.get(i).getX(), coordinate.get(i).getY()));
            }
        }
        for (int i = 0; i < coordinate.size(); i++) {
            d = Math.sqrt(Math.pow((coordinate.get(i).getX() - 0), 2) + Math.pow((coordinate.get(i).getY() - 0), 2));
            length.put(coordinate.get(i), d);
        }
        Map.Entry<Coordinate, Double> maxEntry = null;//представляет собой 1 объект из ленгс

        for (Map.Entry<Coordinate, Double> entry : length.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println("Max length = " + maxEntry.getValue());
    }

    public void square() {
        for (int i = 0; i < coordinates2.size(); i++) {
            for (Coordinate c1 : coordinates2) {
                for (Coordinate c2 : coordinates2) {
                    if (c1.getY() == c2.getY() && c1.getX() != c2.getX()) {
                        for (Coordinate c3 : coordinates2) {
                            if (c2.getX() == c3.getX() && c2.getY() != c3.getY()) {

                                for (Coordinate c4 : coordinates2) {
                                    if (c4.getX() == c1.getX() && c4.getY() == c3.getY()) {
                                        Square square = new Square(c1, c2, c3, c4);
                                        s = Math.abs((c2.getX() - c1.getX()) * (c2.getY() - c3.getY()));
                                        squares.put(square, s);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(squares.size());
    }
    
}

