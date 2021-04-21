package com.example.spring.demo.lesson2example2;

import java.util.Random;

public class RandomIntArrayGenerator {

    private Random random;
    private int size;

    public RandomIntArrayGenerator(Random random, int size) {
        this.random = random;
        this.size = size;
    }

    public int[] getIntArray() {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(101) - 50;
        }
        return arr;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
