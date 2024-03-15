package com.basic.CollectionFramwork;

import java.util.*;

public class Listarry {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(123);
        list.add(1098);
        list.add(765);

        System.out.println(list);
        System.out.println(list.get(2));

//        Iterator<Integer> itr= list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

    }
}
