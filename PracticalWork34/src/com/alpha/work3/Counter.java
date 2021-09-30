package com.alpha.work3;

public class Counter extends Thread {
    private volatile Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i < 1000; i++) {
                while (storage.isReadyToPrint()){
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                storage.setOneInt(storage.getOneInt() + 1);
                storage.setReadyToPrint(true);
                storage.notify();
            }
        }
    }
}
