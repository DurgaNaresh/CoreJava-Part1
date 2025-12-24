package com.durga.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Setter
@Getter
public class SmartPhone {
    private Optional<GraphicsCard> graphicsCard;

    @Override
    public String toString() {
        return "SmartPhone [graphicsCard=" + graphicsCard
                + "]";
    }
}
