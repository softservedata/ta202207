package com.softserve.edu;

import com.softserve.edu01.A;

import java.util.Scanner;

//import java.util.List;

/**
 * Class <font color="red">Example</font>
 */
public class Example {
    private int k = 123;

    public Example() {
        k = 456;
    }

    public Example(int k1) {
        /* This is a sample class which is used to demonstrate the use of multi-line comments.
         * This comment does not appear in the java documentation
         */
        k = k1;
    }

    // This example demonstrates the use of single line comments
    public static void main(String[] args) {
        System.out.println("Hello2");
        int i = 1;
        String s = "abc"; // s = new String("abc")
        //
        Example example = new Example();
        System.out.println("example.k = " + example.k);
        //
        Example example2 = new Example(789);
        System.out.println("example2.k = " + example2.k);
        //
        example.k = 135;
        example2.k = 246;
        System.out.println("example.k = " + example.k + "  example2.k = " + example2.k);
        //
        A a = new A();
        a.m1();
        com.softserve.edu02.A a2 = new com.softserve.edu02.A();
        a2.m1();
        //List<String> lst;
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("name = ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();
    }

}
