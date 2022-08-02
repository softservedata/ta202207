package com.softserve.edu.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Type first decimal unique number using dot = ");
        float number1 = Float.parseFloat(br.readLine());
        System.out.print("Type second decimal unique number using dot = ");
        float number2 = Float.parseFloat(br.readLine());

        if (number1 < number2 || number1 == number2) {
            System.out.println(number1 + "\n" + number2);
        } else {
            System.out.println(number2 + "\n" + number1);
        }
    }
}
