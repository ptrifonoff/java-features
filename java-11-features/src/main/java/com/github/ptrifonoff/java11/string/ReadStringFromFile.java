package com.github.ptrifonoff.java11.string;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadStringFromFile {

    public static void main(String[] args) throws IOException {
        // TODO Read String from a file
        String fileContent = Files.readString(Path.of("./java-11-features/src/main/resources/testfile.txt"), StandardCharsets.UTF_8);
        System.out.println("*** File Content ***");
        System.out.println(fileContent);
    }

}
