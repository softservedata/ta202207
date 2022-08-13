package com.softserve.edu.hw07PA;

public class ProductsMain {
    public static void main(String[] args) {
         Product products[] = {
                new Product("Tea", 75),
                new Product("Fish", 98),
                new Product("Mayonnaise", 52),
                new Product("Fish", 98),
                new Product("Eggs", 56)
        };
        System.out.println("Duplicate products: ");

        int i;
        int k;
        for (i = 0; i < products.length; i++) {
            for (k = i + 1; k < products.length; k++)
                if (products[i].equals(products[k])) {
                    System.out.println(products[i]);}
                }
        }
    }
