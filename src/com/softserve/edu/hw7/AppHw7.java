package com.softserve.edu.hw7;

public class App7 {
    public static void main(String[] args) {
        Product products[] = {new Product("Coffee", 80), new Product("Bread", 20),
                new Product("Milk", 38), new Product("Milk", 36),
                new Product("Candy", 123)};

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
