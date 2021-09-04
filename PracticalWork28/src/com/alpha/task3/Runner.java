package com.alpha.task3;

public class Runner {
    public void run(){
        Integer[] ints= {1,2,3,4,5,6,7,8};
        String[] strings = {"a","s","d","f","g",};
        new MyMixer(ints).shuffle();
        new MyMixer(strings).shuffle();

        for (Integer i : ints) {
            System.out.print(i);
        }
        System.out.println();
        for (String s : strings) {
            System.out.print(s);
        }
    }
}
