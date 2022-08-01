package com.softserve.edu04;

public class App {
    private int i = 123;

    public App() {
        System.out.println("\tConstructor done");
    }

    public void m1() {
        System.out.println("m1() i = " + i);
    }

    public static void main(String[] args) {
        System.out.println("start");
        //System.out.printf("i = " + i); Compile Error
        App app = new App();
        System.out.println("main() app.i = " + app.i);
        //
        App app2 = new App();
        app2.i = 456;
        app2.m1();
        //
        app.m1();
        //
        //System.out.printf("main() i = " + i); //  Compile Error, i not exist
        int i = 321;
        System.out.printf("main() i = " + i);
    }
}
