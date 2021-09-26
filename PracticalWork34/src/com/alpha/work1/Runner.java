package com.alpha.work1;

public class Runner {
    public void run() {
        new MyTimeBomb_1().start();
        new Thread(new MyTimeBomb_2()).start();
    }
}
