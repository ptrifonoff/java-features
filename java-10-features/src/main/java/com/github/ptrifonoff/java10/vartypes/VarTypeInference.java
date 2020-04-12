package com.github.ptrifonoff.java10.vartypes;

import java.util.List;

public class VarTypeInference {

    /*
     * var notAllowedAsAMember;
     */

    public static void main(String[] args) {
        // TODO defining a type with var: Local variable Type inference
        var stringMessage = "this String defined with type declaration <var>";
        System.out.println(stringMessage);

        var integerList = List.of(1, 2, 3, 4);
        System.out.println("This list of integer values is defined with type declaration <var>: " + integerList.toString());

        /*
         * Not allowed:
         * var withNoInitValue;
         * var nullNotAllowed = null;
         */
    }
}
