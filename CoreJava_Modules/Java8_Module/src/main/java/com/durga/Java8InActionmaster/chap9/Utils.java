package com.durga.Java8InActionmaster.chap9;

import java.util.List;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class Utils {
    public static void paint(List<Resizable> l){
        l.forEach(r -> { r.setAbsoluteSize(42, 42); });

        //TODO: uncomment, read the README for instructions
        //l.forEach(r -> { r.setRelativeSize(2, 2); });
    }
}
