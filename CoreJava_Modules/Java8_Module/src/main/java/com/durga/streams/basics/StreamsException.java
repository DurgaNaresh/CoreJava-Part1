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
public class StreamsException {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");

        Stream<String> stream = stringList.stream();

        stream.forEach(System.out::println);

        // Uncomment this line to avoid an exception because stream has already been operated upon or closed
        // stream = stringList.stream();
        stream.forEach(System.out::println);
    }
}
