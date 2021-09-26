package com.alpha.work1;

import java.util.stream.IntStream;

public class MyTimeBomb_2 implements Runnable{
    @Override
    public void run() {
        IntStream.rangeClosed(0,10).forEach(System.out::println);
        System.out.println("Booooooooooooooom!!!");
    }
}
