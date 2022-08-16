package com.softserve.hw8;

public class Appl {
    public static void main(String[] args) {

        Figure[] figures = {new Rectangle(1, 3),
                new Rectangle(6, 7), new Square(7), new Triangle(5, 2, 9)};

        int maxPerm = 0;
        for (int i = 0; i < figures.length -1; i++) {
            if (figures[i].getPerimeter() > figures[i + 1].getPerimeter()) {
                maxPerm = figures[i].getPerimeter();
            }
        }

        System.out.println("Max per = " + maxPerm);

    }
}
