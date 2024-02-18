package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("./a.txt");
        File file2 = new File("./b.txt");
        File file3 = new File("./c.txt");

        try {
            CompareTextFile.compareTextFile(file1, file2, file3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}