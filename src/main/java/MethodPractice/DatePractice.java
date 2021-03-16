package MethodPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DatePractice{
    public static void main(String[] args){
        System.out.println(LocalDate.now());//print current date
        System.out.println(LocalTime.now());//print hour
        System.out.println(LocalDateTime.now());//print both of them
        LocalDate date=LocalDate.now();
        System.out.println("Date is "+date);

        LocalDate date1=LocalDate.of(2020,01,04);
        System.out.println(date1);
        LocalDate date2=LocalDate.of(2020, Month.APRIL,4);
        System.out.println(date2);
        LocalTime time=LocalTime.of(1,34);
        System.out.println(time);
        LocalTime time2=LocalTime.of(2,12,34,123345);
        System.out.println(time2);
        LocalDateTime dt=LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println(dt);
        LocalDateTime dt1=LocalDateTime.of(2021,04,12,12,24,12);
        System.out.println(dt1);
        LocalDateTime dateTime=LocalDateTime.of(date1,time);
        System.out.println(dateTime);

        LocalDate date3=LocalDate.now();
        date3=date3.plusDays(12);
        System.out.println(date3);
        LocalDate dte=LocalDate.now();
        dte=dte.minusDays(13).minusYears(32);
        System.out.println(dte);

    }
}
