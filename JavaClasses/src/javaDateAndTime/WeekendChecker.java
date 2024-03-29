package javaDateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendChecker {
    public static void main(String[] args) {
        LocalDate dateToCheck = LocalDate.of(2023, 01, 8);

        if (isWeekend(dateToCheck)) {
            System.out.println(dateToCheck + " is a weekend day.");
        } else {
            System.out.println(dateToCheck + " is not a weekend day.");
        }
    }

    public static boolean isWeekend(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}
