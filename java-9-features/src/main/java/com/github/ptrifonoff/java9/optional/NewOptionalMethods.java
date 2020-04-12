package com.github.ptrifonoff.java9.optional;

import java.util.Optional;

public class NewOptionalMethods {

    public static void main(String[] args) {
        // TODO Optional.ifPresentOrElse(): define a default action when there is no value
        System.out.println("* A value is present in Optional - so the else method won't be executed *");
        Optional.of("string printed").ifPresentOrElse(System.out::println, () -> System.out.println("no string printed"));

        System.out.println("* This Optional contains no value - so the else method will be executed *");
        Optional.ofNullable(null).ifPresentOrElse(System.out::println, () -> System.out.println("no string printed"));

        // TODO Optional.or(): define a default of type Optional
        System.out.println("* With Optional.or you are able to define a default of type Optional *");
        Optional.ofNullable(null).or(() -> Optional.of("default optional string")).ifPresent(System.out::println);

        // TODO Optional.stream(): converting an Optional to a Stream
        System.out.println("* Creating a stream of Optional *");
        Optional.of("optional converted to stream").stream().forEach(System.out::println);
    }

}
