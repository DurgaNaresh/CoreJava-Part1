package com.durga.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class StreamWithCountTest {
    @Test
    public void shouldCountNumbersInTheList() throws Exception {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);

        long quantity = listOfNumbers
                .stream()
                .count();

        assertThat(quantity, equalTo(5L));
    }
}
