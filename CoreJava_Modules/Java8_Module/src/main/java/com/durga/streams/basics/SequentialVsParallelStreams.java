package com.durga.streams.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class SequentialVsParallelStreams {
    public static void main(String[] args) {
        long startNanoSec = 0;
        long endNanoSec = 0;
        int maxElements = 9992999;

        List<Integer> numberAr = new ArrayList<>();
        for(int i = 0; i < maxElements; i++) { numberAr.add(i); }

        System.out.println("Number of elements to be counted using streams: " + maxElements);

        startNanoSec = System.nanoTime();
        Stream<Integer> sequentialStream  = numberAr.stream();
        System.out.println("Number of elements counted using sequential streams: " + sequentialStream.count());
        endNanoSec = System.nanoTime();

        System.out.println("Time taken to count elements using sequential streams: " + (endNanoSec - startNanoSec) + " nanoSeconds");

        // parallel stream

        startNanoSec = System.nanoTime();
        Stream<Integer> parallelStream = numberAr.parallelStream();
        System.out.println("Number of elements counted using parallel streams: " + parallelStream.count());
        endNanoSec = System.nanoTime();

        System.out.println("Time taken to count elements using parallel streams: " + (endNanoSec - startNanoSec) + " nanoSeconds");
    }
}
