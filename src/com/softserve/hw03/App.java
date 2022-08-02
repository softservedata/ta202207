package com.softserve.hw03;

public class App {
    public static void main(String[] args) {
        Pair pair = new Pair(1,2);
        System.out.println("Origin: " + pair.toString());
        System.out.println("a = " + pair.getA() + "  b = " + pair.getB());
        pair.swap();
        System.out.println("Updated: " + pair);
        System.out.println("a = " + pair.getA() + "  b = " + pair.getB());
    }
}
