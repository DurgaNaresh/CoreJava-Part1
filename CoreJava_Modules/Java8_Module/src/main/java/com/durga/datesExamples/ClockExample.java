package com.durga.datesExamples;

import java.time.Clock;
import java.time.Instant;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class ClockExample {
    public static void main(String[] args) {
        // clock provides date and time using a current time-zone

        Clock clock = Clock.systemDefaultZone();
        System.out.println("Clock: " + clock);
        System.out.println("Current millisecond instant of the clock: " + clock.millis());

        // Instant class is for - instantaneous point on the time-line
        Instant instant = clock.instant();
        System.out.println("Instant: " + instant);
    }
}
