package com.softserve.edu12io;

import java.util.Scanner;

public class ApplPrint {
    public static void main(String[] args) {
        //System.out.println("text text text text text text text text ");
        //System.out.println("text text text text text text text text ");
        //throw new RuntimeException("hohoho");
        //
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("name = ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        //
        System.out.print("age = ");
        int age = sc.nextInt();
        System.out.println("You are " + age);
        //
        System.out.print("surename = ");
        //sc.nextLine();
        String surename = sc.nextLine();
        System.out.println("Hello " + surename);
        //
        sc.close();
    }
}
