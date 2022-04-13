package com.github.ptrifonoff.java12.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesMethod {

    public static void main(String[] args) throws IOException {
        // TODO Files.mismatch: returns byte position of first difference or -1
        System.out.println("* Files.mismatch: returns byte position of first difference *");
        long bytePositionSameFile = Files.mismatch(Paths.get("java-12-features/src/main/resources/test1.txt"),
                Paths.get("java-12-features/src/main/resources/same_as_test1.txt"));
        System.out.println("  Files.mismatch(test1.txt, same_as_test1.txt) results in position: " + bytePositionSameFile);

        long bytePositionDifference = Files.mismatch(Paths.get("java-12-features/src/main/resources/test1.txt"),
                Paths.get("java-12-features/src/main/resources/test2.txt"));
        System.out.println("  Files.mismatch(test1.txt, test2.txt) results in position: " + bytePositionDifference);
    }

}
