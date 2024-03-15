package com.basic.Multithreding.Runnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        Test t = new Test( lock);
        for (int i = 0; i < 100; i++) {

            Thread th = new Thread(t);
            th.start();
        }
    }
}
