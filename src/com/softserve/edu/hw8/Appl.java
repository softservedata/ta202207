package com.softserve.edu.hw8;

//Homework 8 (from 11.08.2022)
//        1) Написати абстрактний клас Figure із абстрактним методом для обчислення периметру.
//        Написати класи Rectangle, Square та Triangle, які наслідують та реалізують Figure.
//        В методі main класу Appl створити масив, який складається із двох прямокутників, квадрата та трикутника.
//        Знайти фігуру з максимальним периметром.
//        Для коду використати пакет com.softserve.edu.hw8
//        Запушати код на github у свою вітку.



public class Appl {
    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle (5,10),
                new Rectangle(7, 14),
                new Square(9),
                new Triangle(3, 6, 6 )
        };

        System.out.println("Rectangle1 perimeter = " + figures[0].getPerimeter());
        System.out.println("Rectangle2 perimeter = " + figures[1].getPerimeter());
        System.out.println("Square perimeter = " + figures[2].getPerimeter());
        System.out.println("Triangle perimeter = " + figures[3].getPerimeter());

       int maxPerimeter = 0;
        for (int i = 0; i <figures.length; i++){
            if (figures[i].getPerimeter() > maxPerimeter){
                maxPerimeter = figures[i].getPerimeter();
            }
        }
        System.out.println(" ");
        System.out.println("Max perimeter = " + maxPerimeter);


        }
    }
