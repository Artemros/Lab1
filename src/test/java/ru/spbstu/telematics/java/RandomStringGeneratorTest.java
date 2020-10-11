package ru.spbstu.telematics.java;

import org.junit.Assert;
import org.junit.Test;

public class RandomStringGeneratorTest {

    @Test
    public void test_length() {
        int length = 5;
        RandomStringGenerator l = new RandomStringGenerator(length);
        Assert.assertEquals(5, l.getNext().length());
    }

    @Test
    public void asci() {
        int length = 5;
        RandomStringGenerator l = new RandomStringGenerator(length);
        String s = l.getNext();
        boolean result = true;
        for (int i = 0; i < length; i++) {
            if ((int) s.charAt(i) > 127) {
                result = false;
                break;
            }
        }
        Assert.assertTrue(result);
    }

    @Test
    public void test_rand() {
        int length = 7;
        RandomStringGenerator l = new RandomStringGenerator(length);
        Assert.assertNotEquals(l.getNext(), l.getNext());
    }


}