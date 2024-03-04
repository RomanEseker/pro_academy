package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        File from = new File(".");
        Thread thread1 = new Thread(new CopyFileThread(from, "text"));
        Thread thread2 = new Thread(new CopyFileThread(from, "txt"));
        Thread thread3 = new Thread(new CopyFileThread(from, "bmp"));
        thread1.start();
        thread2.start();
        thread3.start();


    }
}