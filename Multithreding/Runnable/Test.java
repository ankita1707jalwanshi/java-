package com.basic.Multithreding.Runnable;

import java.util.concurrent.locks.Lock;

public class Test implements Runnable{

//    public synchronized void run() {
    int notoPrint = 1;
    Lock lock;

    public Test(Lock lock){
        this.lock=lock;
    }
    public void run(){
        lock.lock();
        System.out.println(Thread.currentThread().getName());
        notoPrint++;
        lock.unlock();
    }

}
