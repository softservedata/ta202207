package com.softserve.edu.hw8;

public class Appl {

    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(1, 4),
                new Rectangle(6, 9), new Square(8), new Triangle(4, 1, 8)};

        int maxPerm = 0;
        for (int i = 0; i < figures.length - 1; i++) {
            if (figures[i].getPerimeter() > figures[i + 1].getPerimeter()) {
                maxPerm = figures[i].getPerimeter();
            }
        }
        System.out.println("Max per = " + maxPerm);
    }
}

