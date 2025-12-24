package com.durga.datesExamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class ISODateTimeFormattedAndTime {
    public static void main(String[] args) {

        // Display ISO_DATE - formatted date
        DateTimeFormatter ISO_DATE_formatter = DateTimeFormatter.ISO_DATE;
        System.out.println("ISO_DATE: " + ISO_DATE_formatter.format(LocalDate.now()));

        // Display ISO_DATE_TIME - formatted date and time
        DateTimeFormatter ISO_DATE_TIME_formatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("ISO_DATE_TIME: " + ISO_DATE_TIME_formatter.format(LocalDateTime.now()));
    }
}
