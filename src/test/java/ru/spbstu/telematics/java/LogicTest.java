package ru.spbstu.telematics.java;

import org.junit.Assert;
import org.junit.Test;

public class LogicTest {

    @Test
    public void test_length() {
        int length = 5;
        Logic l = new Logic(length);
        Assert.assertEquals(5, l.GetNext().length());
    }

    @Test
    public void asci() {
        int length = 5;
        Logic l = new Logic(length);
        String s = l.GetNext();
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
        Logic l = new Logic(length);
        Assert.assertNotEquals(l.GetNext(), l.GetNext());
    }


}