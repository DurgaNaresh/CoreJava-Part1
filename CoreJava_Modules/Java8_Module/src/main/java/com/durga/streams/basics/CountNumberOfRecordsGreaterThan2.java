package com.durga.streams.basics;

import java.util.stream.IntStream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CountNumberOfRecordsGreaterThan2 {
    public static void main(String[] args) {

        // Count number of records greater than 2
        long countRecordsGreaterThan2 = IntStream.of(1, 2, 3, 4, 5).filter(n-> n > 2).count();
        System.out.println("Count number of records greater than 2: " + countRecordsGreaterThan2);
    }
}
