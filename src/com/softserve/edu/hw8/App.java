package com.softserve.edu.hw8;

import com.softserve.edu.hw8.geometry.Figure;
import com.softserve.edu.hw8.geometry.Rectangle;
import com.softserve.edu.hw8.geometry.Square;
import com.softserve.edu.hw8.geometry.Triangle;

public class App {
    public static void main(String[] args) {
        final Rectangle rect1 = new Rectangle(1, 2);
        final Rectangle rect2 = new Rectangle(1, 6);
        final Triangle triangle = new Triangle(3, 1, 8);
        final Square sq = new Square(8);
        final Figure[] figures = {rect1, rect2, triangle, sq};

        Figure figureWithMaxPerimeter = figures[0];
        for (final Figure f : figures) {
            if (figureWithMaxPerimeter.perimeter() < f.perimeter()) {
                figureWithMaxPerimeter = f;
            }
        }
    }
}
