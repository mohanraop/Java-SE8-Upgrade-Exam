package ocp.study.part8;

import java.time.Duration;
import java.time.Instant;

public class Duration {
    public static void main(String... args) {
        Instant first = Instant.now();
        Instant second = Instant.now();
        java.time.Duration duration = java.time.Duration.between(first, second);
        System.out.println(duration);

        java.time.Duration added = duration.plusDays(3);
        System.out.println(added);

        java.time.Duration subtracted = duration.minusDays(3);
        System.out.println(subtracted);
    }
}
