package ocp.study.part8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Period {
    public static void main(String... args) {
        LocalDate today = LocalDate.now();
        LocalDate java8Release = LocalDate.of(2014, Month.MARCH, 14);
        java.time.Period periodToNextJavaRelease = java.time.Period.between(today, java8Release);
        System.out.println("Months between today and Java 8 release : " + periodToNextJavaRelease.getMonths());

    }
}
