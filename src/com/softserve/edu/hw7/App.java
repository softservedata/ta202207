package com.softserve.edu.hw7;

public class App {
    public static void main(String[] args) {
        final Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product("product" + i, i);
        }
        products[1] = new Product("product" + 0, 0);

        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    System.out.println(products[i]);
                }
            }
        }
    }
}
