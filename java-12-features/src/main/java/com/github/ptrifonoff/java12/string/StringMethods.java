package com.github.ptrifonoff.java12.string;

public class StringMethods {

    public static void main(String[] args) {
        intendMethod();
        transformMethod();
    }

    private static void intendMethod() {
        // TODO String.indent: adds number of blanks when number is positive, when negative it removes blanks
        System.out.println("* String.indent: adds number of blanks when number is positive, when negative it removes blanks *");
        System.out.println("  -> \"mystring\".indent(5) results in: \"" + "mystring".indent(5) + "\" <- with line break at the end");
        System.out.println("  -> \"  mystring\".indent(-7) strips blanks at the beginning, but no other chars: " + "mystring".indent(-7));
        System.out.println("  -> \"  \\tmystring\".indent(-3) also strips tabs: " + "  \tmystring".indent(-3));
    }

    private static void transformMethod() {
        // TODO String.transform: lambda expression for string manipulation
        System.out.println("* String.transform: lambda expression for string manipulation *");
        System.out.println("  -> \"MY_STRING\".transform(String::toLowerCase) results in: \"" + "MY_STRING".transform(String::toLowerCase));
    }

}
