package com;

public class App {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
//            Thread.State
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
