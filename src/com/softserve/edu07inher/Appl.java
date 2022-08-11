package com.softserve.edu07inher;

public class Appl {
    public static void main(String[] args) {
        // /*-
        //B b = new B();
        //System.out.println("i = " + b.getI());
        // */
        /*-
        int i = 1234;
        double d = i;
        System.out.println("i = " + i + "  d = " + d);
        //
        d = 234.51;
        i = (int) d; // Code Smell;
        System.out.println("i = " + i + "  d = " + d);
        */
        /*-
        A a = new A(14);
        System.out.println("i = " + a.getI());
        B b = new B();
        //
        // b = a; // Compile Error
        a = b; // Upcasting
        System.out.println("i = " + a.getI());
        //System.out.printf("a.j = " + a.j); // Compile Error
        //System.out.println("j = " + ((B) a).j); // Code Smell;
        if (a instanceof B) {
            System.out.println("j = " + ((B) a).j); // Ok;
        }
        */
        // /*-
        A a = new B(); // (12);
        System.out.println("i = " + a.getI());
//        B b1;
//        b1 = (B) a; // Downcasting
        if (a instanceof B) {
            System.out.println("j = " + ((B) a).j);
        }
        a.m(); // Code Smell;
        A.m();
        B.m();
        // */
    }
}
