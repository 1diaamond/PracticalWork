package com.alpha.work3;

import com.alpha.work1.DaysOfWeek;

import java.util.Arrays;

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

    public void searchTrains (String station , DaysOfWeek Day){
        for (Train t: trains) {
            if (t.getStationArrival() != null
                    && t.getDays() != null
                    && t.getStationArrival().equals(station)
                    && Arrays.asList(t.getDays()).contains(Day)) {
                System.out.println("I found a train: " + t);
            }
        }
    }
}
