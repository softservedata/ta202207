package com.softserve.edu.hw12PA;

public class Password {
    public static void main(String[] args) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{12,}$";
        String password = "123@pass";
        System.out.println("Password matches the requirements: " + password.matches(pattern));
    }
}
