package com.alpha.work3;

public class Printer extends Thread {
    private volatile Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            while (storage.getOneInt() <=1000) {
                while (!storage.isReadyToPrint()) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Storage is " + storage.getOneInt());
                storage.setReadyToPrint(false);
                storage.notify();
            }
        }
    }
}
