package ocp.study.part8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDate {
    public static void main(String... args) {
        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        java.time.LocalDate yesterday = tomorrow.minusDays(2);

        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(yesterday);

        System.out.println(parseString("2005-Nov-12", "yyyy-MMM-dd", Locale.UK));
        System.out.println(parseString("2005-Nov-12", "yyyy-MMM-dd", Locale.UK).lengthOfYear());

        java.time.LocalDate date1 = java.time.LocalDate.of(2017, 02, 04);
        if (date1.equals(today)) {
            System.out.printf("Today %s and date1 %s are same date %n", today, date1);
        } else {
            System.out.printf("Today %s and date1 %s are not the same date %n", today, date1);
        }

    }

    private static java.time.LocalDate parseString(String string, String format, Locale locale) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        formatter = formatter.withLocale(locale);
        return java.time.LocalDate.parse(string, formatter);
    }
}
