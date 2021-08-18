package com.alpha.work1;

public class Runner {
    public Runner() {
    }
    public void run(){
        System.out.println("Отображение всех дней");
        for (DaysOfWeek day:DaysOfWeek.values()
             ) {
            System.out.println(day);
        }
        System.out.println("\nОтображение дней с занятиями:");
        for (DaysOfWeek day:DaysOfWeek.values()
        ) {
            if(day == DaysOfWeek.MONDAY || day == DaysOfWeek.WEDNESDAY || day == DaysOfWeek.FRIDAY )
            System.out.println(day);
        }

        System.out.println("\nОтображение следующего дня:");
        for (DaysOfWeek day:DaysOfWeek.values()
        ) {
                System.out.println( "Сегодня " +day + " Следующий день = " + DaysOfWeek.nextDay(day));
        }
    }

}
