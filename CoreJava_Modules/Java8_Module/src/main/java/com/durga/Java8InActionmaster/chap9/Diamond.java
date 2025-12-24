package com.durga.Java8InActionmaster.chap9;

/**
 * @author Your Name or DurgaNaresh
 * @date 23-12-2025
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class Diamond {
    public static void main(String...args){
        new D().hello();
    }

    static interface A{
        public default void hello(){
            System.out.println("Hello from A");
        }
    }

    static interface B extends A { }

    static interface C extends A {
    }

    static class D implements B, C {

    }
}
