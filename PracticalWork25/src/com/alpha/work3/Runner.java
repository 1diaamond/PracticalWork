package com.alpha.work3;

import java.util.Scanner;

public class Runner {
    public void run(){
        Scanner sc = new Scanner(System.in);
    TrainSchedule trainSchedule = new TrainSchedule(5);
        trainScheduleFiller(trainSchedule,sc);
        trainSchedule.printTrains();

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
