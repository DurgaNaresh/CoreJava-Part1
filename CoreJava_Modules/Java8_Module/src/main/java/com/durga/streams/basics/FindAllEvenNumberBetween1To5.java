package com.durga.streams.basics;

import java.util.stream.IntStream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class FindAllEvenNumberBetween1To5 {
    public static void main(String[] args) {

        // Find all even numbers between 1 to 5
        // Numbers between 1 to 5
        IntStream.range(1, 6).filter(n-> n % 2 == 0).forEach(System.out::println);

        // OR

        System.out.println("*****");
        IntStream.of(1, 2, 3, 4, 5, 6).filter(n-> n % 2 == 0).forEach(System.out::println);
    }
}
