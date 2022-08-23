package com.softserve.edu.hw7;

public class HW7 {
    public static void main(String[] args) {
        Product[] products = {new Product("Milk", 80), new Product("Apple", 20),
                new Product("Bread", 40), new Product("Milk", 80),
                new Product("Water", 13)};

        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if ((products[i].equals(products[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + products[j]);
                }
            }
        }
    }
}