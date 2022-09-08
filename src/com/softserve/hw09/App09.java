package com.softserve.hw09;

import java.util.Arrays;

public class App09 {

    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(2,3), new Rectangle(3,3), new Triangle(2,3,4)};
        System.out.println("original figures = " + Arrays.toString(figures));
        //
        Arrays.sort(figures);
        System.out.println("\nsorted figures = " + Arrays.toString(figures));
    }
}
