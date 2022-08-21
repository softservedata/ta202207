package com.softserve.edu.hw08PA;

public class Square extends  Figure {

    private int side1;

    public Square(int side1) {
        this.side1 = side1;
    }


      @Override
     public int Perimeter() {
              return 4*side1;

    }
}
