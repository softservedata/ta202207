package com.softserve.hw05;

public class App05 {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int t;
        //
        /*-
         * Here is a block comment with some very special
         * formatting that I want indent(1) to ignore.
         * one
         * 		two
         * 				three
         */
        System.out.println("Original a, b, c = " + a + ", " + b + ", " + c);
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        System.out.println("a, b, c = " + a + ", " + b + ", " + c);
    }
}
