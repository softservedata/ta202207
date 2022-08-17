package com.softserve.edu.hw8;

public class Rectangle extends Figure{
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getPerimeter() {
        return 2 * (a + b);
    }


    }

