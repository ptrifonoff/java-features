package com.github.ptrifonoff.java10.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionCopyOf {

    public static void main(String[] args) {
        // TODO List.copyOf, Set.copyOf, Map.copyOf produces unmodifiable copy of a collection
        List<String> modifiableStringList = Arrays.asList("String 1", "String 2", "String 3");
        List<String> unmodifiableStringList = List.copyOf(modifiableStringList);
        try {
            unmodifiableStringList.add("String 4 is not allowed");
        } catch (UnsupportedOperationException e) {
            System.err.println("a list produced with copyOf can't be modified");
        }
    }
}
