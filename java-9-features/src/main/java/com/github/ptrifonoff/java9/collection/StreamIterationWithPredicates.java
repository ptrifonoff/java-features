package com.github.ptrifonoff.java9.collection;

import java.util.stream.IntStream;

public class StreamIterationWithPredicates {

    public static void main(String[] args) {
        // TODO IntStream.iterate as an alternative to for (int i = 0; i<20; i++) {}
        IntStream.iterate(0, i -> i < 20, i -> i + 1).forEach(System.out::println);
    }
    
}
