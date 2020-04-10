package com.github.ptrifonoff.java9.collection;

import java.util.stream.IntStream;

public class StreamDropAndTakeWhile {

    public static void main(String[] args) {
        // the methods takeWhile and dropWhile only make sense with ordered streams - otherwise it's not deterministic
        
        // TODO takeWhile stops iteration of stream as soon as takeWhile predicate evaluates to false; the number >= 13 does not have any effect
        System.out.println(
                "* Iterating stream using new method takeWhile: stops when condition evaluates to false the first time *");
        IntStream.rangeClosed(1, 20).takeWhile(number -> number <= 10 || number >= 13).forEach(System.out::println);

        // TODO dropWhile starts iteration of stream as soon as dropWhile predicate evaluates to true; the number >= 13 does not have any effect
        System.out.println(
                "* Iterating stream using new method dropWhile: starts when condition evaluates to false the first time *");
        IntStream.rangeClosed(1, 20).dropWhile(number -> number <= 10 || number >= 13).forEach(System.out::println);

        System.out.println("* Compared to the filtering method introduced in Java 8 *");
        IntStream.rangeClosed(1, 20).filter(number -> number <= 10 || number >= 13).forEach(System.out::println);
    }
    
}
