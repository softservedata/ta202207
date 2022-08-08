package com.softserve.edu.hw6;

//Homework 6 (from 04.08.2022)
//        1) Створити еnum Drinks з трьома екземплярами об'єктів WATER, COFFEE, WINE.
//        Реалізувати у Drinks конструктор з параметром description.
//        Додати також поле description та методи getDescription() та toString().
//        В основній програмі в циклі вивести всі описи об'єктів.
//        Для коду використати пакет com.softserve.edu.hw6
//        Запушати код на github у свою вітку.



public class AppEnum {

public static void main(String[]args){

        Drinks drinks = Drinks.WATER;
        System.out.println(drinks.getDescription());

        Drinks drinks1 = Drinks.COFFEE;
        System.out.println(drinks1.getDescription());

        Drinks drinks2 = Drinks.WINE;
        System.out.println(drinks2.getDescription());


        }
}
