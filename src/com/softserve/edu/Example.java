package com.softserve.edu;

import com.softserve.edu01.A;

import java.util.Scanner;

public class Example extends Object {

    private int k = 123;
    private float k2 = 123;


    public Example() {
        k = 456;
    }

    public Example(int k1) {
        k = k1;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println("Hello2");
        int i = 1;
        String s = "abc"; // s =new String("abc")
        System.out.println("example.k = " + example.k);
        //
        Example example2 = new Example(789);
        System.out.println("example2.k = " + example2.k);
        //
        example.k = 135;
        example2.k = 246;
        System.out.println("example.k = " + example.k + " example2.k = " + example2.k);
        //
        A a = new A();
        a.m1();
        com.softserve.edu02.A a2 = new com.softserve.edu02.A();
        a2.m1();
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("name = ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        //

        String name1 = "Tanya"; // name =new String("name")
        System.out.println(name1.toString());
    }
}
