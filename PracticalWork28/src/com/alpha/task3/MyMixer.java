package com.alpha.task3;

import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }
    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i < array.length-1; i++) {
            int index = random.nextInt(array.length);
            T temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
