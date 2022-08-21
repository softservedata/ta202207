package com.softserve.edu.hw08PA;

public class Rectangle extends Figure {


    private int side1;
    private int side2;


    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

     @Override
    public int Perimeter() {
        return 2*(side1 + side2);
    }


}
