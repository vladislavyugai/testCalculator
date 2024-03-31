package ru.vacpay.vacationpaycalculator.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class HolyDays {
    private static final List<LocalDate> holyDays = addHolidays();

    private static List<LocalDate> addHolidays(){
        List<LocalDate> holiDay = new ArrayList<>();
        holiDay.add(LocalDate.of(2024,1,1));
        holiDay.add(LocalDate.of(2024,1,2));
        holiDay.add(LocalDate.of(2024,1,3));
        holiDay.add(LocalDate.of(2024,1,4));
        holiDay.add(LocalDate.of(2024,1,5));
        holiDay.add(LocalDate.of(2024,1,8));
        holiDay.add(LocalDate.of(2024,2,23));
        holiDay.add(LocalDate.of(2024,3,8));
        holiDay.add(LocalDate.of(2024,5,1));
        holiDay.add(LocalDate.of(2024,5,9));
        holiDay.add(LocalDate.of(2024,6,12));
        holiDay.add(LocalDate.of(2024,11,4));
      return holiDay;
    }
    public static List<LocalDate> getHolyDays(){
        return holyDays;
    }
}
