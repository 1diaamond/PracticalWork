package com.alpha.work1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Runner {
    public void run() {
        List<Integer> integers= Arrays.asList(new Runner().arrayCreator());
        System.out.println(integers);
        Collections.sort(integers, (a,b) -> b.compareTo(a));
        System.out.println(integers);

    }

    private Integer[] arrayCreator(){
        Random random = new Random();
        Integer[] integers = new Integer[20];
        for (int i = 0; i < 20; i++) {
            integers[i] = random.nextInt(100) - 50;
        }
        return integers;
    }


}
