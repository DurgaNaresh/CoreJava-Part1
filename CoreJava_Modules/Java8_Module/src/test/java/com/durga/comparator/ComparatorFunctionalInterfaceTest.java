package com.durga.comparator;

import lombok.Getter;
import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class ComparatorFunctionalInterfaceTest {
    @Test
    public void shouldCompareTwoGuidesByUsingComparator() throws Exception {
        CraftCoderGuide mockito = new CraftCoderGuide("Mockito");
        CraftCoderGuide java = new CraftCoderGuide("Java 8");

        Comparator<CraftCoderGuide> comparator = new Comparator<CraftCoderGuide>() {

            @Override
            public int compare(CraftCoderGuide first, CraftCoderGuide second) {
                return first.getName().compareTo(second.getName());
            }
        };

        int compared = comparator.compare(mockito, java);

        assertThat(compared, greaterThan(0));
    }

    @Test
    public void shouldCompareTwoGuidesByUsingComparatorWithLambdaExpression() throws Exception {
        CraftCoderGuide mockito = new CraftCoderGuide("Mockito");
        CraftCoderGuide java = new CraftCoderGuide("Java 8");

        Comparator<CraftCoderGuide> comparator = (first, second) -> first.getName().compareTo(second.getName());

        int compared = comparator.compare(mockito, java);

        assertThat(compared, greaterThan(0));
    }

    @Test
    public void shouldCompareAndReverseTwoGuidesByUsingComparator() throws Exception {
        CraftCoderGuide mockito = new CraftCoderGuide("Mockito");
        CraftCoderGuide java = new CraftCoderGuide("Java 8");

        Comparator<CraftCoderGuide> comparator = (first, second) -> first.getName().compareTo(second.getName());

        int compared = comparator.reversed().compare(mockito, java);

        assertThat(compared, lessThan(0));
    }

}

@Getter
class CraftCoderGuide {

    private String name;

    public CraftCoderGuide(String name) {
        this.name = name;
    }

}
