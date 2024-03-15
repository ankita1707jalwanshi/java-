package com.basic.ComparableOperator;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Car> pq= new PriorityQueue<>();
        pq.add(new Car(45,678));
        pq.add(new Car(55,670));
        pq.add(new Car(65,671));

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
