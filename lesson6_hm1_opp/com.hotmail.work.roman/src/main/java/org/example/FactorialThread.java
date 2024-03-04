package org.example;

import java.math.BigInteger;

public class FactorialThread implements Runnable{
    private final int sizeArrayThread = 100;
    private final Thread [] arrayThread = new Thread[sizeArrayThread];

    public FactorialThread() {
    }

    public Thread[] getArrayThread() {
        return arrayThread;
    }

    private void initThread(){
        for (int i = 0; i < sizeArrayThread; i++){
            arrayThread[i] = new Thread();
            arrayThread[i].start();
        }
    }

    private BigInteger  calculateFactorial(int number) {
        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        initThread();

        for(int i = 0; i < sizeArrayThread; i++){
            System.out.println(arrayThread[i].getName() + " Factorial " + (i + 1) + " = " + calculateFactorial(i + 1));
        }
    }
}
