package com.softserve.hw10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App10 {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1, 4);
        List<Integer> lst2 = Arrays.asList(2, 3, 5, 2, 6, 4, 5, 1, 2);
        System.out.println("lst1 = " + lst1);
        System.out.println("lst2 = " + lst2);
        //
        Set<Integer> set1 = new HashSet<>(lst1);
        Set<Integer> set2 = new HashSet<>(lst2);
        //
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        //
        System.out.println("res = " + set1.equals(set2));
    }
}
