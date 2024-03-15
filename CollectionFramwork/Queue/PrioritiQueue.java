package com.basic.CollectionFramwork.Queue;

import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class PrioritiQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(6);
        minHeap.add(7);
        minHeap.add(8);
        minHeap.add(9);
        System.out.println(minHeap);
    }

}
