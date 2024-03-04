package org.example;


public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new CalculateThread(0, 14999999));
        Thread thread2 = new Thread(new CalculateThread(15000000, 29999999));
        Thread thread3 = new Thread(new CalculateThread(30000000, 44999999));
        Thread thread4 = new Thread(new CalculateThread(45000000, 59999999));


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}