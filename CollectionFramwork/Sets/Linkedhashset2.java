package com.basic.CollectionFramwork.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset2 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        HashSet<Integer> s = new HashSet<>();
        l.add(2);
        l.add(89);
        l.add(4);
        l.add(8);
        l.add(6);


        s.add(2);
     s.add(89);
       s.add(4);
        s.add(8);
        s.add(6);
//        System.out.println(s);
//        System.out.println(l);

for(int a : l){
    System.out.println(a+" ");
}
for(int b: s){
    System.out.println(b+" ");
}






    }
}
