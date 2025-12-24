package com.durga.streams;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class StreamWithSortedTest {
    @Test
    public void shouldSortTheList() throws Exception {
        List<String> listOfWords = Arrays.asList("B", "A", "D", "E", "C");

        List<String> sortedList = listOfWords
                .stream()
                .sorted()
                .collect(Collectors.toList());

        assertThat(sortedList, CoreMatchers.hasItems("A", "B", "C", "D", "E"));
    }

    @Test
    public void shouldSortTheListWithInvertedComparator() throws Exception {
        List<String> listOfWords = Arrays.asList("B", "A", "D", "E", "C");

        Comparator<String> inverted = (String o1, String o2) -> o2.compareTo(o1);

        List<String> sortedList = listOfWords
                .stream()
                .sorted(inverted)
                .collect(Collectors.toList());

        assertThat(sortedList, CoreMatchers.hasItems("E", "D", "C", "B", "A"));
    }
}
