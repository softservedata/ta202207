package com.softserve.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        System.out.print("Hello World. What is your name? ");
        String name = br.readLine();
        System.out.print("How old are you? ");
        int age = Integer.parseInt(br.readLine());
        //
        System.out.println("Hello World " + name);
        System.out.println("You are " + age);
        //
        br.close();
    }
}
