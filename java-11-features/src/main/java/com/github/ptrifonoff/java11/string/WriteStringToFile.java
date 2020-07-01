package com.github.ptrifonoff.java11.string;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteStringToFile {

    public static void main(String[] args) throws IOException {
        // TODO Write String to a file
        Path resultFile = Files.writeString(Path.of("./java-11-features/target/written_testfile.txt"),
                "Line 1\nLine 2", StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        System.out.println("File written to " + resultFile.toString());
    }

}
