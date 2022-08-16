package com.softserve.hw8;

public class Rectangle extends Figure {

    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter () {
        return 2 * (width + height);
    }


}
