package com.softserve.hw13;

import static java.lang.Thread.sleep;

public class Run1p implements Runnable {

    public void run() {
        for(int i = 0; i < 10; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("ID: 0011!");
        }
            }
        }
