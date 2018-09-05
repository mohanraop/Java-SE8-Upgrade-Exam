package ocp.study.part8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime {

    public static void main(String... args) {
        java.time.ZonedDateTime dateTime = java.time.ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");
        System.out.println(dateTime);

        java.time.ZonedDateTime a = java.time.ZonedDateTime.now();
        System.out.println(a);

        java.time.ZonedDateTime b = java.time.ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(b);
    }

}
