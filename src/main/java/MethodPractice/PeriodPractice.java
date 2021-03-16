package MethodPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodPractice{
    public static void main(String[] args){
        Period days=Period.ofDays(20);
        System.out.println(days);

        Period weeks= Period.ofWeeks(3);
        System.out.println(weeks);

        Period months=Period.ofMonths(6);
        System.out.println(months);

        Period years=Period.ofYears(1);
        System.out.println(years);

        Period period=Period.of(1,6,20);
        System.out.println(period);

        Period pr=Period.ofYears(1).ofMonths(2).ofDays(23);//result is the last one
        System.out.println(pr);

        DateTimeFormatter dateTime=DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(dateTime.format(LocalDate.now()));
        System.out.println(dateTime.format(LocalDateTime.now()));

        DateTimeFormatter date=DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(date.format(LocalTime.now()));
        DateTimeFormatter date1=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(date1.format(LocalDateTime.now()));

        LocalDate dt1=LocalDate.of(2020,2,3);
        System.out.println(dt1);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMMM yyyy,dd|hh:mm");
        LocalDateTime time=LocalDateTime.now();
        System.out.println(dtf.format(time));

        DateTimeFormatter dttf=DateTimeFormatter.ofPattern("YYYY/dd/MMM");
        LocalDate dte=LocalDate.now();
        System.out.println(dttf.format(dte));
    }
}
