package com.softserve.edu.hw9;

public class Square extends Figure {
    public Square(int a) {
        super(a,a);
    }

    public int getPerimeter() {
        return 4 * a;
    }

}
