package com.softserve.edu.hw06PA;

public class DrinksMain {

        public static void main(String[] args) {
            System.out.println("List of Drinks categories:");
            for (Drinks drinks : Drinks.values()) {
                 System.out.println(drinks);
            }
        }
    }
