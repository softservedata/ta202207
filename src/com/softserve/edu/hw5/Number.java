package com.softserve.edu.hw5;

//Homework 5 (from 01.08.2022)
//        1) Прочитати з клавіатури три числа (цілих або дійсних).
//        Вивести ці числа на екран у порядку зростання.
//        Для коду використати пакет com.softserve.edu.hw5
//        Запушати код на github у свою вітку.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter variable a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter variable b: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Enter variable c: ");
        int c = Integer.parseInt(br.readLine());

    int temp;
        if (a > b) {
        temp = a;
        a = b;
        b = temp;
    }
        if (b > c) {
        temp = b;
        b = c;
        c = temp;
    }
        if (a > c) {
        temp = a;
        a = c;
        c = temp;
    }
        System.out.printf("The viriables are sorted in ascending order: %d %d %d\n", a, b, c);
}
}
