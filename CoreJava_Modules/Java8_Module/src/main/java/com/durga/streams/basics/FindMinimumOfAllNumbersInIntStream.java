package com.durga.streams.basics;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class FindMinimumOfAllNumbersInIntStream {
    public static void main(String[] args) {

        // Find minimum of all numbers in IntStream
        OptionalInt min = IntStream.of(9, 5, 3, 12, 4).min();
        System.out.println("Min: " + min.getAsInt());
    }
}
