package com.durga.streams.basics;

import java.util.stream.IntStream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class FindSumOfAllBetween1To5AndAdd10ToThat {
    public static void main(String[] args) {

        // find sum of all between 1 to 5 and add 10 to that
        int reduce = IntStream.of(1, 2, 3, 4, 5).reduce(10, (x, y)-> x + y);
        System.out.println("Sum of all between 1 to 5 and added 10 to that: " + reduce);
    }
}
