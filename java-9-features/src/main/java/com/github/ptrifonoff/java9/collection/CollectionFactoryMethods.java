package com.github.ptrifonoff.java9.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {

    public static void main(String[] args) {
        // TODO List.of(), Set.of(), Map.of(): there are now collection factory methods on collection interfaces
        List<String> stringListCreatedWithOfFactory = List.of("Element 1", "Element 2", "Element 3");
        System.out.println("Liste = " + stringListCreatedWithOfFactory);

        Set<Integer> integerSetCreatedWithOfFactory = Set.of(1, 2, 3);
        System.out.println("Set = " + integerSetCreatedWithOfFactory);

        Map<String, Integer> mapCreatedWithOfFactory = Map.of("Key 1", 1, "Key 2", 2);
        System.out.println("Map = " + mapCreatedWithOfFactory);

        Map<String, Integer> mapCreatedWithOfEntriesFactory = Map
                .ofEntries(Map.entry("Key 1", 1), Map.entry("Key 2", 2), Map.entry("Key 3", 3));
        System.out.println("Map (ofEntries) = " + mapCreatedWithOfEntriesFactory);
    }

}
