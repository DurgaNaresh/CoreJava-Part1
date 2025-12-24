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
public class FindMaximumOfAllNumbersInIntStream {
    public static void main(String[] args) {

        // Find maximum of all numbers in IntStream
        OptionalInt max = IntStream.of(9, 5, 3, 12, 4).max();
        System.out.println("Max: " + max.getAsInt());
    }
}
