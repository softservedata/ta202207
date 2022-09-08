package com.softserve.edu.hw11;

import java.util.*;

public class AppHw11 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 7, 1, 2, 3, 6, 8, 8);
        List<Integer> list2 = Arrays.asList(3, 3, 2, 2, 1, 1, 4, 4, 5, 5, 9);
        //delete duplicates in lists
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        System.out.println("List 1 without duplicates = " + set1);
        System.out.println("List 2 without duplicates = " + set2);

        //compare elements
        System.out.println("equal numbers are = " + set1.equals(set2));

        //create common list
        List<Integer> list3 = new ArrayList<>(list1);
        list3.retainAll(list2);
        System.out.println("List 3 is = " + list3);

        //common set without duplicates
        Set<Integer> set3 = new HashSet<>(list3);
        System.out.println("Set 3 is = " + set3);
    }
}
