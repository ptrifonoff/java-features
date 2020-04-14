package com.github.ptrifonoff.java9.scanner;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScannerFindAll {

    public static void main(String[] args) {
        // TODO Scanner.findAll: returns Stream of MatchResult to easily walk through all regular expression results
        Stream<MatchResult> scannerMatchResultStream = new Scanner("<word 1>, more words, <word 2>").findAll("<(.+?)>");
        System.out.println("* Scanner result of findAll *");
        System.out.println(
                scannerMatchResultStream.map(matchResult -> matchResult.group(1)).collect(Collectors.toList()));
    }
}
