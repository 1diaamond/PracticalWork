package com.alpha.work1;

import java.util.stream.IntStream;

public class MyTimeBomb_2 implements Runnable{
    @Override
    public void run() {
        IntStream.rangeClosed(0,10).forEach(x -> {
            System.out.println(10-x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        System.out.println("Booooooooooooooom!!!");

    }
}
