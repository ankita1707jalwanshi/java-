package com.basic.CollectionFramwork;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("abcs");
        s.push("qwer");
        s.push("lkjh");
        s.push("asdf");
        System.out.println(s);
        Iterable<String> obj = s;
        for (String str:obj){
            System.out.println(str);


        }
    }
}
