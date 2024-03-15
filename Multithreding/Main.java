package com.basic.Multithreding;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Firsthreads th = new Firsthreads();
            th.start();
        }

    }
}
