package com.github.ptrifonoff.java11.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMethods {

    public static void main(String[] args) {
        // TODO String.isBlank tests a String for one or more chars that are interpreted as "blank" like empty string, blank space, tab, crlf
        System.out.println("* String.isBlank method evaluates to true for different types of 'blank' *");
        System.out.println("  -> empty string evaluates to " + "".isBlank());
        System.out
                .println("  -> one or more chars that are interpreted as blanks evaluate to " + "\r\n\t   ".isBlank());
        System.out.println(
                "  -> even unicode spaces are interpreted as blank [result is " + "\u200A\u205F".isBlank() + "]");
        System.out.println("  -> other chars will evaluate to false [result is " + " a ".isBlank() + "]");
        System.out.println();

        // TODO String.lines extracts the lines in a string to a stream
        System.out.println("* String.lines creates a stream *");
        Stream<String> lineStream = "String 1\r\nString 2\nString 3".lines();
        System.out.println("  -> lines as a list collected from stream: " + lineStream.collect(Collectors.toList()));

        // TODO String.strip, String.stripLeading, String.stripTrailing removes whitespaces supporting unicode whitespaces (in contrast to String.trim) 
        System.out.println("* String.strip* methods that trim whitespaces including unicode *");
        System.out.println("  -> stripping whitespaces with new strip method: " + "\u200A\u205F test\n".strip());
        System.out.println("  -> compared to trimming whitespaces with good old trim method, ignoring unicode: "
                + "\u200A\u205F test\n".trim());
        
        // TODO String.repeat(n) repeats a string n times
        System.out.println("* String.repeat(n) repeats a string n times *");
        System.out.println("  -> Repeating a string 10 times: " + "Hey Ho ".repeat(10));
    }
    
}
