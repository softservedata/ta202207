package com.softserve.edu.hw8;

public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "\nSquare{" +
                "a=" + a +
                '}';
    }

    public int getPerimeter(){
        return a*4;
    };
}