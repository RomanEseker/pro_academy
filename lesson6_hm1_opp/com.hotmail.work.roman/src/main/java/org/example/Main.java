package org.example;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new FactorialThread());
        th1.start();

    }
}