package com.durga.streams.basics;

import java.util.OptionalInt;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class HowToUseOptionalIntInJava {
    public static void main(String[] args) {

        OptionalInt optionalInt = OptionalInt.of(5);

        //isPresent() will return true - If a value is present
        System.out.println("optionalInt.isPresent(): " + optionalInt.isPresent());

        // get() returns a value
        System.out.println("optionalInt.get(): " + optionalInt.getAsInt());

        // orElse method - Return the value if present, otherwise return other
        System.out.println("optionalInt.orElse: " + optionalInt.orElse(6));


        System.out.println("\n1. optionalInt.ifPresent");
        //ifPresent method - If a value is present, it invokes the specified consumer with the value, otherwise do nothing
        optionalInt.ifPresent(System.out::println);

        System.out.println("\n2 - optionalInt.ifPresent");
        // Display some custom message if value is present
        optionalInt.ifPresent((i) -> System.out.println("value = " + i)); // value = 5
    }
}
