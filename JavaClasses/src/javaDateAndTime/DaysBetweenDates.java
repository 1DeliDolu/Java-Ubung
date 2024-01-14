package javaDateAndTime;


import java.time.LocalDate;

import java.time.temporal.ChronoUnit;


public class DaysBetweenDates {
    
	
	public static void main(String[] args) {
//        String date1String = "2022-01-01";
//        String date2String = "2022-01-15";
//
//        LocalDate date1 = LocalDate.parse(date1String);
//        LocalDate date2 = LocalDate.parse(date2String);
//
//        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        //Duration duration = Duration.between(date1, date2);
        //System.out.println(duration);
		DaysBetweenDates d=new DaysBetweenDates();
        System.out.println(d.longDays());
        
//        System.out.println("LocalDate.parse(date1String):"+LocalDate.parse(date1String));
//        System.out.println("LocalDate.parse(date2String):"+LocalDate.parse(date2String));
//        
      TimeBetweenTimes.arbeitZeit();
      
    }

	
	public String toString() {
		return super.toString() + "]";
	}
	public long longDays() {
		
	
	String date1String = "2022-01-01";
    String date2String = "2022-01-15";

    LocalDate date1 = LocalDate.parse(date1String);
    LocalDate date2 = LocalDate.parse(date2String);

    long daysBetween;
    return ChronoUnit.DAYS.between(date1, date2);
    
}}

    