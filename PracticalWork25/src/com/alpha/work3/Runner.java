package com.alpha.work3;

import com.alpha.work1.DaysOfWeek;

import java.util.Scanner;

public class Runner {
    public void run(){
        Scanner sc = new Scanner(System.in);
    TrainSchedule trainSchedule = new TrainSchedule(5);
        trainScheduleFiller(trainSchedule,sc);
        trainSchedule.printTrains();
        trainSchedule.getTrains()[0].setDays( new DaysOfWeek[]{DaysOfWeek.FRIDAY,DaysOfWeek.THURSDAY});
        trainSchedule.getTrains()[1].setDays( new DaysOfWeek[]{DaysOfWeek.WEDNESDAY,DaysOfWeek.MONDAY});
        trainSchedule.getTrains()[2].setDays( new DaysOfWeek[]{DaysOfWeek.SATURDAY,DaysOfWeek.TUESDAY});
        trainSchedule.getTrains()[3].setDays( new DaysOfWeek[]{DaysOfWeek.SATURDAY,DaysOfWeek.TUESDAY});
        trainSchedule.getTrains()[2].setStationArrival("Kiev");
        trainSchedule.getTrains()[1].setStationArrival("Donetsk");
        trainSchedule.getTrains()[3].setStationArrival("Lviv");
        trainSchedule.getTrains()[3].setStationArrival("Kiev");
        trainSchedule.searchTrains("Kiev",DaysOfWeek.TUESDAY);
    }

    private static void trainScheduleFiller(TrainSchedule trainSchedule , Scanner scanner){
        for (int i = 0; i < trainSchedule.getTrains().length; i++) {
            System.out.println("Введите номер поезда: ");
            int trainNumber = scanner.nextInt();
            Train train = new Train(trainNumber);
            trainSchedule.addTrain(train);
        }

    }
}
