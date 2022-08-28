package com.softserve.edu.hw09PA;

import java.util.Arrays;
public class App9 {
    public static void main(String[] args) {
        Figure figures[] = {
                new Rectangle(20, 15),
                new Rectangle( 10, 20),
                new Square(5),
                new Square (7),
                new Triangle(15, 20, 35),
                new Triangle(4,8,9)
        };

        System.out.println("Sorted figure perimeters: ");
        System.out.println(Arrays.toString(Arrays.stream(figures).sorted().map(Figure::getPerimeter).toArray()));
    }
}
