package com.softserve.edu.hw12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type the password please!");
        String password = br.readLine();

        //pattern to verify is password correct
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{12,}$";

        //print true if password matches with pattern
        System.out.println(password.matches(pattern));
    }
}
