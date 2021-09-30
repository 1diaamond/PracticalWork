package com.alpha.work3;

public  class Storage {
    private volatile int oneInt;
    private volatile boolean readyToPrint = true;

    public boolean isReadyToPrint() {
        return readyToPrint;
    }

    public void setReadyToPrint(boolean readyToPrint) {
        this.readyToPrint = readyToPrint;
    }

    public Storage() {
        this.oneInt = 0;
    }

    public int getOneInt() {
        return oneInt;
    }

    public void setOneInt(int oneInt) {
        this.oneInt = oneInt;
    }
}
