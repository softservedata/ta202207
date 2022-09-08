package com.softserve.hw09;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "\nTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
