package com.softserve.edu.hw9;

//Homework 9 (from 15.08.2022)
//        1) Взяти за основу класи з попереднього завдання, внести зміни.
//        Абстрактний клас Figure повинен містити декларацію методу обчислення периметра getPerimeter(),
//        наслідувати інтерфейс Comparable<Figure> та реалізувати метод compareTo(Figure figure) звертаючись до метода getPerimeter().
//        Класи Rectangle та Square наслідують Figure та реалізовують метод обчислення периметра.
//        Задати масив, який містить об'єкти Rectangle, Square та Triangle (достатньо 5-6 елементів).
//        Посортувати фігури по довжині периметра.
//        Для коду використати пакет com.softserve.edu.hw9
//        Запушати код на github у свою вітку.

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        final Rectangle rect1 = new Rectangle(5, 10);
        final Rectangle rect2 = new Rectangle(3, 6);
        final Triangle triangle1 = new Triangle(18, 16, 10);
        final Triangle triangle2 = new Triangle(5, 7, 9);
        final Square sq1 = new Square(9);
        final Square sq2 = new Square(15);

        final Figure[] figures = {rect1, rect2, triangle1, triangle2, sq1, sq2};

        System.out.println(Arrays.toString(Arrays.stream(figures).sorted().map(Figure::getPerimeter).toArray()));
    }
}
