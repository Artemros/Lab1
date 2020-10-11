package ru.spbstu.telematics.java;

public class App {
    public static void main(String[] args) {
        String result = new Logic(Integer.parseInt(args[0])).GetNext();
        System.out.println(result);
    }
}
