package com.softserve.edu;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSwitch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = br.readLine();

        switch (input.toLowerCase()) {
            case "yes":
                System.out.println("Ok");
                break;
            case "maybe":
                System.out.println("Great!");
                break;
            case "no":
                System.out.println("Too bad!");
                break;
            default:
                System.out.println("Wrong!");
        }
        input = input.replaceAll("\\D", "");
        int i = Integer.valueOf(input.length() == 0? "0":input);
        System.out.println("i + 1 = " + (i + 1));

    }
}