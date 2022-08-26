package com.softserve.hw11;

//Homework 11 (from 22.08.2022)
//        1) Задати два списки, які містять цілі значення.
//        На підставі цих двох лістів створити новий List, який містить лише спільні елементи з обох заданих списків без повторень.
//        Для коду використати пакет com.softserve.homework11
//        Запушати код на github у свою вітку.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Values {
    public static void main(String[] args) {

        List<Integer> first = new ArrayList<>();
        Collections.addAll(first,1, 2, 3, 4, 5, 8, 6);

        List <Integer> second = new ArrayList<>();
        Collections.addAll(second,9, 3, 8, 4, 1, 7);

        List<Integer> third = new ArrayList<>(first);
        third.retainAll(second);

        System.out.println("duplicated values: " + third);
    }
    }