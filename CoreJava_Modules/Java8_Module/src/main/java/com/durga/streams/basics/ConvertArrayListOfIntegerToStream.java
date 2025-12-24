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
public class ConvertArrayListOfIntegerToStream {
    public static void main(String[] args) {

        System.out.println("Step 1. Creating list of integer.");
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(11);
        listOfIntegers.add(12);

        System.out.println("Step 2. Converting list (ArrayList) of integer to stream.");
        Stream<Integer> streamOfInteger = listOfIntegers.stream();

        System.out.println("Step 3. Display stream of integer: ");
        streamOfInteger.forEach(System.out::println);
    }
}
