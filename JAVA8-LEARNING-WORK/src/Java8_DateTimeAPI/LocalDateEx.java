package Java8_DateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateEx {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: "+localDate);

        LocalDate localDate1 = LocalDate.of(2022,07,17);
        System.out.println("LocalDate1: "+localDate1);

        //LocalDate localDate2 = LocalDate.ofYearDay(2022,365);
        LocalDate localDate2 = LocalDate.ofYearDay(2022,02);
        System.out.println("localDate2: "+localDate2);


       /* get value from LocalDate*/
        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getYear: " + localDate.getYear());
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
        System.out.println("getDayOfMonth: " + localDate.getDayOfMonth());
        System.out.println("getMonthValue: " + localDate.getMonthValue());
        System.out.println("getChronology: " + localDate.getChronology());
        System.out.println("getEra: " + localDate.getEra());
        System.out.println("Day Of the Month: " + localDate.get(ChronoField.DAY_OF_MONTH));


        /* modifying LocalDate*/
        System.out.println("plusDays " + localDate.plusDays(2));
        System.out.println("plusMonths " + localDate.plusMonths(2));
        System.out.println("minusDays " + localDate.minusDays(2));
        System.out.println("withYear " + localDate.withYear(2020));

        System.out.println("With ChronosField " + localDate.with(ChronoField.YEAR,2010));
        System.out.println("With TemporalAdjusters: " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("ChronoUnit minus: " + localDate.minus(2, ChronoUnit.YEARS));


        /* Additional support  methods*/
        System.out.println("leapYear : " + LocalDate.ofYearDay(2021,01).isLeapYear());
        System.out.println("leapYear : " + LocalDate.ofYearDay(2022,01).isLeapYear());

        System.out.println("isEqual : "+ localDate.isEqual(localDate1));
        System.out.println("isBefore : "+ localDate.isBefore(localDate1));
        System.out.println("isAfter : "+ localDate.isAfter(localDate1));


        /* unsupported*/
        //System.out.println("ChronoUnit.MINUTES: " + localDate1.minus(1,ChronoUnit.MINUTES)); //Unsupported unit: Minutes
        System.out.println("isSupported : " + localDate1.isSupported(ChronoUnit.YEARS));


    }
}
