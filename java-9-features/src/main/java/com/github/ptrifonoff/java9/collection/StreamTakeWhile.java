package com.github.ptrifonoff.java9.collection;

import java.util.stream.IntStream;

public class StreamTakeWhile {

    public static void main(String[] args) {
        // TODO takeWhile stops iteration of stream when takeWhile evaluates to false
        System.out.println(
                "* Iterating stream using new method takeWhile: stops when condition evaluates to false the first time*");
        IntStream.rangeClosed(1, 20).takeWhile(number -> number <= 10 || number >= 13).forEach(System.out::println);

        System.out.println("* Compared to the filtering method introduced in Java 8 *");
        IntStream.rangeClosed(1, 20).filter(number -> number <= 10 || number >= 13).forEach(System.out::println);
    }
    
}
