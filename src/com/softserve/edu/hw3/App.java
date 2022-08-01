package com.softserve.edu.hw3;

public class App {

    public static void main(String[] args) {
        Pair pair = new Pair(5,10);
        System.out.println("Origin:  " + pair);
        pair.swap();
        System.out.println("Updated:  " + pair);


    }
}
