package com.durga.Java8InActionmaster.chap5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Transaction {
    private Trader trader;
    private int year;
    private int value;
}
