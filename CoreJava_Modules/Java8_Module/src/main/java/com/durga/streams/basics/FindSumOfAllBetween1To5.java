package com.durga.streams.basics;

import java.util.stream.IntStream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class FindSumOfAllBetween1To5 {
    public static void main(String[] args) {

        // Find sum of all between 1 to 5
        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println("Sum is: " + sum);
    }
}
