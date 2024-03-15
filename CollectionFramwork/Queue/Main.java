package com.basic.CollectionFramwork.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer>q1 = new LinkedList<>();
        q1.add(12);
        q1.add(34);
        q1.add(56);
        q1.add(78);
        q1.add(90);
        q1.add(10);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1);
//        System.out.println(q1.addAll());

    }
}
