package org.example;

import java.math.BigInteger;

public class CalculateThread implements Runnable
{
    private final int arrayIntSize = 60000000;
    private int first;
    private int second;
    private int arrayInt [] = new int[arrayIntSize];

    public CalculateThread(int first, int second) {
        super();
        this.first = first;
        this.second = second;
    }

    public int getArrayIntSize() {
        return arrayIntSize;
    }

    public int[] getArrayInt() {
        return arrayInt;
    }

    private void initArrayInt(){
        for (int i = 0; i < arrayIntSize; i++){
            arrayInt[i] = (int) (Math.random() * 9);
        }
    }

    private BigInteger calculateSum(int start, int end){
        BigInteger sum = BigInteger.ZERO;
        for(int i = start; i <= end; i++){
            sum = sum.add(BigInteger.valueOf(arrayInt[i]));
        }
        return sum;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        initArrayInt();
        System.out.println("Array int sum of " + thread.getName() + " is " + calculateSum(first, second));

    }
}
