package com.softserve.hw04.edu;

public class App {
    public static void main(String[] args) {
        System.out.println("Ok");
        // /*
        byte b =1;
        // b = b + 1; // Compile error
        b = (byte) (b + 1); // 1 is int
        System.out.println("b =  " + b);
        //
        float f =1;
        f = f+311.5f;
        System.out.println("f = " + f);
        b = (byte) f; // Code Smell
        System.out.println("new b = " + b); // 56

    }
}
