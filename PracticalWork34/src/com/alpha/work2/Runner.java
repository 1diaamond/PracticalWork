package com.alpha.work2;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Runner {
    public void run(){
        Integer[] integers = Stream
                .generate(() -> new Random().nextInt(1000))
                .limit(100)
                .collect( Collectors.toList()).toArray(new Integer[] {});

     Thread thread1 = new MySumCount_1(0,5,integers);
     MySumCount_2 mySumCount_2 = new MySumCount_2(0,5,integers);
     Thread thread2 = new Thread(mySumCount_2);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MySumCount_1 is "+ ((MySumCount_1)thread1).getResultSum());

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MySumCount_2 is " + mySumCount_2.getResultSum());
    }
}
