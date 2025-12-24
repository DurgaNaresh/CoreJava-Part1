package com.durga.streams.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CollectionsVsStreams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(new String[] {"only", "fullstack", "java", "spring", "automation"}));

        System.out.println("Collection Printing");
        for(String names : list) {
            System.out.println(names);
        }

        System.out.println("\n\nStream Printing");
        list.stream().forEach(System.out::println);
    }
}
