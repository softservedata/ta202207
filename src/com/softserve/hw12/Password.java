package com.softserve.hw12;

public class Password {
    public static void main(String[] args) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{12,}$";
        String password = "Test@1234567";
        System.out.println(password.matches(pattern));
    }

}
