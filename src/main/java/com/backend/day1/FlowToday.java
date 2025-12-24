package com.backend.day1;

public class FlowToday {

    public static void main(String[] args) {
        System.out.println("Main started");

        greet();
        greet();

        System.out.println("Main finished");
    }

    static void greet() {
        System.out.println("greet started");
        System.out.println("greet ended");
    }
}
