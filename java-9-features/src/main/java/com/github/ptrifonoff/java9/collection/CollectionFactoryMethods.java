package com.github.ptrifonoff.java9.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {

    public static void main(String[] args) {
        // TODO there are now collection factory methods on List, Set and Map
        List<String> stringListCreatedWithOfFactory = List.of("Element 1", "Element 2", "Element 3");
        System.out.println("Liste = " + stringListCreatedWithOfFactory);

        Set<Integer> integerSetCreatedWithOfFactory = Set.of(1,2,3);
        System.out.println("Set = " + integerSetCreatedWithOfFactory);

        Map<String, Integer> mapCreatedWithOfFactory = Map.of("Key 1", 1, "Key 2", 2);
        System.out.println("Map = " + mapCreatedWithOfFactory);
    }
    
}
