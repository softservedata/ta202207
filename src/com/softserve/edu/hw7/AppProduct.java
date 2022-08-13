package com.softserve.edu.hw7;

public class AppProduct {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("Black Tea", 10.50),
                new Product("Green Tea", 20.50),
                new Product("Bread", 5.50),
                new Product("Burger", 30.00),
                new Product("Green Tea", 20.50)};

        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if ((products[i].equals(products[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + products[j]);
                }
            }
        }
    }
}


