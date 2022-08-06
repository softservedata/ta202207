package com.softserve.edu.hw05PA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        System.out.print("Enter number a ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter number b ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Enter number c ");
        int c = Integer.parseInt(br.readLine());

        br.close();


        int x;

        if (a > b) {
            x = a;
            a = b;
            b = x;
        }

        if (b > c) {
            x = b;
            b = c;
            c = x;
        } else b = b;

        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else c = c;


        //
        System.out.println(+a);
        System.out.println(+b);
        System.out.println(+c);
        //
    }
}


