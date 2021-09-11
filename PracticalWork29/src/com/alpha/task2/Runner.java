package com.alpha.task2;

public class Runner {
    public void run (){
        System.out.println( new MyNumGenerator(7,50).generateList());
        System.out.println( new MyNumGenerator(7,6).generateSet());
    }
}
