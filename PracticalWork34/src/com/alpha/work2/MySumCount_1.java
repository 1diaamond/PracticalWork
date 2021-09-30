package com.alpha.work2;

public class MySumCount_1 extends Thread {
    private int startIndex;
    private int stopIndex;
    private Integer[] myArray;
    private long resultSum ;

    public long getResultSum() {
        return resultSum;
    }

    public MySumCount_1(Integer startIndex, Integer stopIndex, Integer[] myArray) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.myArray = myArray;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= stopIndex; i++) {
        //    System.out.println("element is " + myArray [i].toString());
            resultSum += myArray [i];
        //    System.out.println("result is " + resultSum);
        }
    }
}
