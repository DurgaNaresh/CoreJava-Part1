package com.durga.datesExamples;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CreateOwnLocalDateUsingLocalDateOfMethod {
    public static void main(String[] args) {

        System.out.println("Create custom/own LocalDate");

        LocalDate createOwnDate1 = LocalDate.of(2018, Month.OCTOBER, 22);
        System.out.println("CreateOwnDate: " + createOwnDate1);

        // Create own LocalDate from STRING using parse method
        String dateString = "2018-10-22";
        LocalDate createOwnDate2 = LocalDate.parse(dateString);
        System.out.println("CreateOwnDate2: " + createOwnDate2);
    }
}
