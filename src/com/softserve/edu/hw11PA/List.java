package com.softserve.edu.hw11PA;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(5);
        list1.add(9);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(7);

        ArrayList<Integer> common = new ArrayList<>(list1);
          common.retainAll(list2);
        System.out.println("diplicate values" + common);
        }
    }

