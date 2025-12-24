package com.durga.functions.functionalinterface;

import com.durga.functions.RealFunctionalInterface;
import org.junit.Test;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class FunctionalInterfaceTest {
    @Test
    public void shouldUseRealFunctionalInterface() throws Exception {
        RealFunctionalInterface functionalInterface = new RealFunctionalInterface() {

            @Override
            public void doSomething() {
                System.out.println("Doing Something");
            }
        };

        functionalInterface.doSomething();
    }

    @Test
    public void shouldUseRealFunctionalInterfaceWithJava8LambdaExpression() throws Exception {
        RealFunctionalInterface functionalInterface = () -> System.out.println("Doing Something");

        functionalInterface.doSomething();
    }

    @Test
    public void shouldToBypassTheLambdaExpressionRule() throws Exception {
//		AnotherFakeFunctionalInterface fake = () -> {}; Compilation error
    }
}
