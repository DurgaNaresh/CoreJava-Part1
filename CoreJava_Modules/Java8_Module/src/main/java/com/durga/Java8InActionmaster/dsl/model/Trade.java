package com.durga.Java8InActionmaster.dsl.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter

public class Trade {
    public enum Type { BUY, SELL }

    private Type type;

    private Stock stock;

    private int quantity;

    private double price;

    public double getValue() {
        return quantity * price;
    }
}
