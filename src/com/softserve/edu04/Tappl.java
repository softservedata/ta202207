package com.softserve.edu04;

public class Tappl {
    
    static {
        System.out.println("\tTappl Static block");
    }
    
    public static void main(String[] args) {
        System.out.println("Start main");
        Helper.setMessage("hello1");
        Helper.print();
        //
        // Not recommended:
//        Helper helper = new Helper();
//        helper.setMessage("new message");
//        helper.print();
    }

}
