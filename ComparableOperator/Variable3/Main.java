package com.basic.ComparableOperator.Variable3;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Car> pq = new PriorityQueue<>(new SpeedComparator());
        pq.add(new Car(45, 678, "abcd"));
        pq.add(new Car(55, 670, "qwerty"));
        pq.add(new Car(35, 671, "asdfg"));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
