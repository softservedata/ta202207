package com.softserve.edu.hw09PA;


public class Square extends Figure {

    private int side1;

    public Square(int side1) {
        this.side1 = side1;
    }


    @Override
    public int getPerimeter() {
        return 4*side1;

    }
}