package ru.spbstu.telematics.java;

import java.util.Random;

public class Logic {
    private final int length;
    private final Random random;

    public Logic(int length) {
        this.random = new Random();
        this.length = length;
    }

    public String GetNext() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append((char) (32 + random.nextInt(94)));
        }
        return result.toString();
    }

}
