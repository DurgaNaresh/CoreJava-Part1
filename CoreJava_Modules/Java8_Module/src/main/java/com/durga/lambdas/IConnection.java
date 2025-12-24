package com.durga.lambdas;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@FunctionalInterface
public interface IConnection {
    public void connect();

    default void print() {
        System.out.println("in default print method");
    }

    static void description() {
        System.out.println("in static method");
    }
}
