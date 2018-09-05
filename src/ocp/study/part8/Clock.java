package ocp.study.part8;

import java.time.Clock;

public class Clock {
    public static void main(String... args) {
        java.time.Clock clock = java.time.Clock.systemUTC();
        System.out.println("Clock : " + clock);
        java.time.Clock.systemDefaultZone();
        System.out.println("Clock : " + clock);
    }
}
