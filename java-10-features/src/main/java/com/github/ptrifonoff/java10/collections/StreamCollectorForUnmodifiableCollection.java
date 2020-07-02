package com.github.ptrifonoff.java10.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorForUnmodifiableCollection {

    public static void main(String[] args) {
        // TODO Collectors.toUnmodifiableList to collect streams to a list (also available for Set or Map)
        List<Integer> unmodifiableIntList = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableList());
        try {
            unmodifiableIntList.add(4);
        } catch (UnsupportedOperationException e) {
            System.err.println("a list produced by Collector toUnmodifiableList can't be modified");
        }
    }
}
