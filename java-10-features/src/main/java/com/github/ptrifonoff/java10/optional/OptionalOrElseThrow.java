package com.github.ptrifonoff.java10.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalOrElseThrow {

    public static void main(String[] args) {
        try {
            // TODO orElseThrow throws NoSuchElementException if Optional is empty
            Optional.empty().orElseThrow();
        } catch (NoSuchElementException e) {
            System.err.println("orElseThrow throws NoSuchElementException if Optional is empty");
        }
    }
}
