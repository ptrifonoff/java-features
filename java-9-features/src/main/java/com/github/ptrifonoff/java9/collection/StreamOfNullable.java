package com.github.ptrifonoff.java9.collection;

import java.util.stream.Stream;

public class StreamOfNullable {

    public static void main(String[] args) {
        System.out.println("* Stream.ofNullable(null): no result *");
        Stream.ofNullable(null).forEach(System.out::println);

        System.out.println("* Stream.ofNullable(1): result *");
        Stream.ofNullable(1).forEach(System.out::println);
    }
}
