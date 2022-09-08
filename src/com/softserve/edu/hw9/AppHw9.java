package com.softserve.edu.hw9;

import java.util.Arrays;

public class AppHw9 {
    public static void main(String[] args) {
        FigureHw9[] figures = {new RectangleHw9(4,9), new SquareHw9(6), new TriangleHw9(8, 10, 3)};
        System.out.println("\nFigures = " + Arrays.toString(figures));
        //sorting ASC
        Arrays.sort(figures);
        System.out.println("\nFigures after sorting = " + Arrays.toString(figures));
    }
}
