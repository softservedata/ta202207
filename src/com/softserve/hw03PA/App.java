package com.softserve.hw03PA;

public class App {
    public static void main(String[] args) {
Pair pair =  new Pair (123, 456);
        System.out.println("Initial values for i & k:");
pair.print();
pair.swap();
        System.out.println("Swapped values for i & k:");
pair.print();
    }
}
