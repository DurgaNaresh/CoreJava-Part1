package com.durga.Java8InActionmaster.chap9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class Intro {
    public static void main(String...args){

        List<Integer> numbers = Arrays.asList(3, 5, 1, 2, 6);
        // sort is a default method
        // naturalOrder is a static method
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }
}
