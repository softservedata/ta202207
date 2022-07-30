package com.softserve.edu03;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List l;
        System.out.println("Ok");
        // /*
        byte b = 1;
        //b = b + 1; // Compile Error
        b = (byte) (b + 1); // 1 is int
        System.out.println("b = " + b);
        //
        float f = 1;
        f = f + 311.5f;
        System.out.println("f = " + f);
        //b = f; // Compile Error
        b = (byte) f; // Code Smell
        System.out.println("new b = " + b);  // 56
        // */
        // /*
        f = (float) Math.sqrt(2.25);
        System.out.println("f = " + f);
        //
        int k; // Not dafault
        // System.out.println("k = " + k); // Error, Variable 'k' might not have been initialized
        Student student = null;
        System.out.println("student = " + student); // toString();
        student = new Student();
        System.out.println("student = " + student.toString());
        k = student.getAge();
        System.out.println("k = " + k);
        //
        k = b;
        System.out.println("k = b: " + k);
        b = (byte) 128;
        System.out.println("b = (byte) 128 = " + b);  // -128
        b = (byte) 255; // 1111 1111 = -1
        System.out.printf("b = (byte) 255 = " + b + "  as Hex b = %h", b);  // -1  toString();
        //
        b = 49;
        System.out.println("b = (byte) 49 = " + b + " b as (char) = " + (char) b);
        //
        if (b > 1) {
            int m = 1;
            System.out.printf("m = " + m);
        }
        //System.out.printf("m = " + m); // Compile Error, Cannot resolve symbol 'm'
        // */
    }
}
