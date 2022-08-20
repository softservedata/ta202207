package com.softserve.edu.hw10;

//Homework 10 (from 18.08.2022)
//        1) Задати два списки (ArrayList), які містять цілі значення.
//        Кількість елементів у списках може бути різною, а самі елементи можуть дублюватися.
//        Вияснити, чи контент елементів у списках співпадає.
//        Наприклад, вміст наступних списків є однаковий [1, 2, 1, 2, 3] та [3, 3, 2, 2, 1, 1]
//        Для коду використати пакет com.softserve.edu.hw10
//        Запушати код на github у свою вітку.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        Collections.addAll(first,1, 2, 1, 2, 3);

        List <Integer> second = new ArrayList<>();
        Collections.addAll(second,3, 3, 2, 2, 1, 7);

        System.out.println("first: " + first);
        System.out.println("second: " + second);

        if(first.size() == second.size() && first.containsAll(second)){
            System.out.println("EQUALS");
        }else System.out.println("FALSE");

        Collections.sort(first, new Comparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first.compareTo(second);
            }
        });

        Collections.sort(second, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer second, Integer first) {
                        return second.compareTo(first);
                    }
                });
        System.out.println("sorted first: " + first);
        System.out.println("sorted second: " + second);
    }
}



