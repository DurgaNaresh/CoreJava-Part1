package com.durga.streams.basics;

import java.util.OptionalDouble;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class UseOptionalDouble {
    public static void main(String[] args) {

        OptionalDouble optionalDouble = OptionalDouble.of(5.0);

        System.out.println("optionalDouble.isPresent(): " + optionalDouble.isPresent());

        // get() returns the value
        System.out.println("optionalDouble.get(): " + optionalDouble.getAsDouble());

        // orElse method - Return the value if present, otherwise return other
        System.out.println("optionalDouble.orElse: " + optionalDouble.orElse(6.0));

        System.out.println("\n1. optionalDouble.ifPresent");
        //ifPresent method - If a value is present, it invokes the specified consumer with the value, otherwise do nothing
        optionalDouble.ifPresent(System.out::println);

        System.out.println("\n2. optionalDouble.ifPresent");
        // Display some custom message if value is present
        optionalDouble.ifPresent(d-> System.out.println("Value: " + d));
    }
}
