package com.alpha.work3;

public class TrainSchedule {
    private Train[] trains;
    private int index;

    public TrainSchedule(int trainsNumber) {
        trains = new Train[trainsNumber];
        index = 0;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public void addTrain(Train train){
        if (index < trains.length)
        trains[index++] = train;
    }
    public void printTrains(){
        for (Train t:trains
             ) {
            System.out.println(t);
        }
    }
}
