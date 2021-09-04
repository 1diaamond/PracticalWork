package com.alpha.task12;

public class Runner {
    public void run(){
        Integer[] ints= {1,2,3,4,5,0,-7};
        Double[] doubles= {1.2,2.7,3.1,4.7,5.7,0.0,-7.9,66.1};
        System.out.println(MyTestMethod.calcNum(ints,2));
        System.out.println(MyTestMethod.calcNum(doubles,2.7));
        System.out.println(MyTestMethod.calcSum(doubles,2.7));
        System.out.println(MyTestMethod.calcSum(ints,2));
    }
}
