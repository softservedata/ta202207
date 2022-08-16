package com.softserve.hw8;

public class Square extends Figure {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int getPerimeter() {

        return 4 * width;
    }
}

