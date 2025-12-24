package com.backend.day1;

public class MulticallFlow {

    public static void main(String[] args) {
        System.out.println("Main start");
        first();
        System.out.println("Main end");
    }

    static void first() {
        System.out.println("Inside first");
        second();
        System.out.println("Back in first");
    }

    static void second() {
        System.out.println("Inside second");
    }
}
