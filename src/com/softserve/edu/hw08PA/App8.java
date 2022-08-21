package com.softserve.edu.hw08PA;

public class App8 {
    public static void main(String[] args) {
 Figure figures[] = {
         new Rectangle (20, 15),
         new Rectangle( 10, 20),
         new Square(5),
         new Triangle(15, 20, 35)
         };
        int max_figure_perimeter = 0;

        int i;
        for (i = 0 ; i < figures.length-1; i++)
        {if (figures[i].Perimeter() < figures[i+1].Perimeter())
        {
            max_figure_perimeter = figures[i+1].Perimeter();
                    }
        }
                System.out.println("Maximum figure perimeter: " + max_figure_perimeter);
    }
}
