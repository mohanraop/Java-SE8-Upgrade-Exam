package ocp.study.part8;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTime {
    public static void main(String... args) {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        ZoneId systemDefault = ZoneId.systemDefault();

        System.out.println(systemDefault);

        java.time.LocalTime systemDefaultnow = java.time.LocalTime.now(systemDefault);

        System.out.println(systemDefaultnow);

        java.time.LocalTime now1 = java.time.LocalTime.now(zone1);
        java.time.LocalTime now2 = java.time.LocalTime.now(zone2);

        System.out.println(now1);
        System.out.println(now2);

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);

        java.time.LocalTime newTime = systemDefaultnow.plusHours(2);
        System.out.println("Time after 2 hours : " + newTime);
    }
}
