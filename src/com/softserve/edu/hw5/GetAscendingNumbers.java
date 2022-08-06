package com.softserve.edu.hw5;

import java.util.Scanner;

public class GetAscendingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber)
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        else if (firstNumber < thirdNumber && thirdNumber < secondNumber)
            System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
        else if (secondNumber < firstNumber && firstNumber < thirdNumber)
            System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
        else if (secondNumber < thirdNumber && thirdNumber < firstNumber)
            System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
        else if (thirdNumber < firstNumber && firstNumber < secondNumber)
            System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
        else if (thirdNumber < secondNumber && secondNumber < firstNumber)
            System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
    }
}
