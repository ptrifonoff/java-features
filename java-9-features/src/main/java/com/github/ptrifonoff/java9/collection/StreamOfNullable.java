package com.github.ptrifonoff.java9.collection;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamOfNullable {

    public static void main(String[] args) {
        // TODO Stream.ofNullable: passing a possible null element to Stream factory method
        System.out.println("* Stream.ofNullable(null): no result *");
        Stream.ofNullable(null).forEach(System.out::println);

        System.out.println("* Stream.ofNullable(1): result *");
        Stream.ofNullable(1).forEach(System.out::println);

        // TODO Optional.stream(): converting an Optional to a Stream
        System.out.println("* Creating a stream of Optional *");
        Optional.of("optional converted to stream").stream().forEach(System.out::println);
    }
}
