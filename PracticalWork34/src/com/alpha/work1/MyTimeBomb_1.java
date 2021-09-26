package com.alpha.work1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyTimeBomb_1 extends Thread{
    @Override
    public void run() {
        IntStream.rangeClosed(0,10).forEach(i -> System.out.println(10-i));
        System.out.println("Boom!!!");
    }
}
