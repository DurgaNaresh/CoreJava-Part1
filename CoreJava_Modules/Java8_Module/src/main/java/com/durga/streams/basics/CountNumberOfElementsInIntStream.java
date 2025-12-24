package com.durga.streams.basics;

import java.util.stream.IntStream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CountNumberOfElementsInIntStream {
    public static void main(String[] args) {

        // Count number of elements in IntStream
        long count = IntStream.of(1, 2, 3, 4, 5).count();
        System.out.println("Count: " + count);
    }
}
