package com.alpha.work3;

public class Runner {
    public void run(){
        Storage storage = new Storage();
        Thread counter = new Counter(storage);
        Thread printer = new Printer(storage);
        counter.start();
        printer.start();
    }
}
