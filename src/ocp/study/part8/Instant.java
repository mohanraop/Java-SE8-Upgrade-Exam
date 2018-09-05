package ocp.study.part8;

import java.time.Instant;
import java.util.Date;

public class Instant {

    public static void main(String... args) {
        java.time.Instant timestamp = java.time.Instant.now();
        System.out.println("What is value of this instant " + timestamp);

        // Converting between Instant and util.Date
        Date date = Date.from(timestamp);
        java.time.Instant instant = date.toInstant();
    }
}
