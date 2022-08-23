package com.softserve.edu.hw9;

import java.util.Arrays;

public class Appl {

    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(1, 4),
                new Rectangle(6, 9), new Square(8), new Triangle(4, 1, 8)};

        System.out.println(Arrays.toString(Arrays.stream(figures).sorted().map(Figure::getPerimeter).toArray()));
    }
}

