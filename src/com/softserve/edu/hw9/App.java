package com.softserve.edu.hw9;

import com.softserve.edu.hw9.geometry.Figure;
import com.softserve.edu.hw9.geometry.Rectangle;
import com.softserve.edu.hw9.geometry.Square;
import com.softserve.edu.hw9.geometry.Triangle;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        final Rectangle rect1 = new Rectangle(1, 2);
        final Rectangle rect2 = new Rectangle(1, 6);
        final Triangle triangle1 = new Triangle(3, 4, 8);
        final Triangle triangle2 = new Triangle(1, 1, 5);
        final Square sq1 = new Square(8);
        final Square sq2 = new Square(4);
        final Figure[] figures = {rect1, rect2, triangle1, triangle2, sq1, sq2};

        System.out.println(Arrays.toString(Arrays.stream(figures).sorted().map(Figure::getPerimeter).toArray()));
    }
}
