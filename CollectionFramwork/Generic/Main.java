
package com.basic.CollectionFramwork.Generic;

public class Main {
    public static void main(String[] args) {
        Box<String> obj = new Box("akuh");
//        obj.container=789;
        System.out.println(obj.getContainer());

        Box<Integer> bx  = new Box(123);
//        bx.container="gh";

        System.out.println(bx.getContainer());
    }
}
