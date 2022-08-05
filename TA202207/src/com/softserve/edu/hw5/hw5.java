package com.softserve.edu.hw5;

import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.io.*;
import java.util.Arrays;

public class hw5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Enter first number");
        int number1 = Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int number2 = Integer.parseInt(br.readLine());
        System.out.println("Enter third number");
        int number3 = Integer.parseInt(br.readLine());
        int[] numbers = {number1, number2, number3};
        Arrays.sort(numbers);
        System.out.println("Ascending order"+ Arrays.toString(numbers));
    }
}