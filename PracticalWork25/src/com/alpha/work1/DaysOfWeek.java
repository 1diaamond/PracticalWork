package com.alpha.work1;

public enum DaysOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static DaysOfWeek nextDay (DaysOfWeek day){
        if (day.ordinal()==6){
            return SUNDAY;
        }else return DaysOfWeek.values()[day.ordinal()+1];
    }
}
