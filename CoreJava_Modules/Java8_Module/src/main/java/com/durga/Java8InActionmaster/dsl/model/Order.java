package com.durga.Java8InActionmaster.dsl.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
public class Order {
    private String customer;

    private List<Trade> trades = new ArrayList<>();

    public void addTrade( Trade trade ) {
        trades.add( trade );
    }
    public double getValue() {
        return trades.stream().mapToDouble( Trade::getValue ).sum();
    }
}
