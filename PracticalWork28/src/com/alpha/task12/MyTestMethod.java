package com.alpha.task12;

public class MyTestMethod {
    public static <T extends Number> int calcNum ( T[] array , T maxValue ){
        int counter = 0;
        for (T s : array) {
            if (s.doubleValue() > maxValue.doubleValue()){
                counter++;
            }
        }
    return counter;
    }

    public static <T extends Number> double calcSum ( T[] array , T maxValue ){
        double sum = 0.0;
        for (T s : array) {
            if (s.doubleValue() > maxValue.doubleValue()){
                sum+=s.doubleValue();
            }
        }
        return sum;
    }
}
