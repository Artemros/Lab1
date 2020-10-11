package ru.spbstu.telematics.java;

public class App {
    public static void main(String[] args) {
        String result = new RandomStringGenerator(Integer.parseInt(args[0])).getNext();
        System.out.println(result);
    }
}
