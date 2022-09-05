package com.softserve.hw12;

//Homework 12 (from 29.08.2022)
//        1) Нехай згідно вимог пароль користувача повинен бути не коротшим за 12 символів та містити великі та малі букви латинського алфавіту, цифри і спецсимволи.
//        Використовуючи регулярні вирази, виконайте перевірку пароля (прочитати з клавіатури) на валідність.
//        Для коду використати пакет com.softserve.homework12
//        Запушати код на github у свою вітку.


import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args)  {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{12,}$";
        String userpass;
        System.out.print("Enter your Password: ");
        Scanner scr = new Scanner(System.in);
        userpass = scr.nextLine();
        if (userpass.matches(pattern)) {
            System.out.println("Пароль действителен");
        }
        else {
            System.out.println("Пароль недействителен");
        }
    }

}
