package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File(".");
        File file2 = new File(".\\resources");

        Thread thread1 = new Thread(new FileScannerThread(file, file));
        Thread thread2 = new Thread(new FileScannerThread(file2, file2));
        thread1.start();
        thread2.start();
    }
}