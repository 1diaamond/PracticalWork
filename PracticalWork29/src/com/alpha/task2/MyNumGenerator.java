package com.alpha.task2;

import java.util.*;

public class MyNumGenerator {
    int numOfElm;
    int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generateList(){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }
    public Set<Integer> generateSet(){
        if (numOfElm > maxNumb) {
            throw new ArithmeticException("Bro, plz change numOfElm or maxNumb)");}
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            set.add(random.nextInt(maxNumb));
        }
        return set;
    }
}
