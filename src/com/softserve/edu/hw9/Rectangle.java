package com.softserve.edu.hw9;


public class Rectangle extends Figure {
    public Rectangle(int a, int b) {
        super(a,b);

    }

    public int getPerimeter() {
        return 2 * (a + b);
    }


}
