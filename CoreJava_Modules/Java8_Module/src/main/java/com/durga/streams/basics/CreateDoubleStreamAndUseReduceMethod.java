package com.durga.streams.basics;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CreateDoubleStreamAndUseReduceMethod {
    public static void main(String[] args) {

        System.out.println("Create DoubleStream:");
        DoubleStream streamOfDoubles = DoubleStream.of(1.1, 2.2, 3.3);

        System.out.println("Use reduce() method - to calculate sum of double in DoubleStream");

        // reduce() method will reduce stream to calculate sum of Doubles in DoubleStream
        OptionalDouble optionalDouble = streamOfDoubles.reduce((i1, i2) -> i1 + i2);

        //Display optionalDouble
        System.out.println("Sum = " + optionalDouble.getAsDouble());
    }
}
