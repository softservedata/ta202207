package com.softserve.edu.hw8;

import java.util.Arrays;

public class AppHw8 {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(4, 9),new Rectangle(4, 13), new Square(20), new Square(2), new Triangle(80, 10, 3)};
        System.out.println("\nFigures = " + Arrays.toString(figures));
        //max perimeter
        Figure max = figures[0];
        for (final Figure i : figures) {
            if (max.getPerimeter() < i.getPerimeter()) {
                max = i;
            }
        }
        System.out.println("Figure with max perimeter is = " + max);
    }
}
