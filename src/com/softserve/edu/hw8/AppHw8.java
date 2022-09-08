package com.softserve.edu.hw8;

import java.util.Arrays;

public class AppHw8 {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(4,9), new Square(6), new Triangle(8, 10, 3)};
        System.out.println("\nFigures = " + Arrays.toString(figures));
        //sorting ASC
        Arrays.sort(figures);
        System.out.println("\nFigures after sorting = " + Arrays.toString(figures));
    }
}
