package com.softserve.edu;

public class Exerscise {
    public static void main(String[] args){
        int b;

        b = (byte) 2590;
        System.out.println("b = (byte) 128 = " + b);  // -128
        b = (byte) 255; // 1111 1111 = -1
        System.out.printf("b = (byte) 255 = " + b + "  as Hex b = %h", b);  // -1  toString()
    }
}
