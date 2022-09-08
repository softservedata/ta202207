package com.softserve.hw09;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "\nRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
