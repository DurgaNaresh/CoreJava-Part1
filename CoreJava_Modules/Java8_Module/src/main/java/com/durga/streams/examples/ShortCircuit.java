package com.durga.streams.examples;

import java.util.Arrays;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class ShortCircuit {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,11};

        System.out.println("*** Printing the first 5 elements of stream :");
        Arrays.stream(arr)
                .limit(5)
                .forEach(System.out::println);

        Integer findFirst = Arrays.stream(arr).filter(i -> (i%2) == 0)
                .findFirst()
                .orElse(-1);

        System.out.println("*** findFirst : " + findFirst);

        Integer findAny = Arrays.stream(arr).filter(i -> (i%2) == 0)
                .findAny()
                .orElse(-1);

        System.out.println("*** findAny : " + findAny);

        System.out.println("*** All numbers are less than 12 : " + Arrays.stream(arr).allMatch(i-> i < 12));
        System.out.println("*** Contains any numbers greater than 10 : " + Arrays.stream(arr).anyMatch(i-> i == 8));
        System.out.println("*** All numbers are less than 10 : " + Arrays.stream(arr).noneMatch(i-> i > 10));
    }
}
