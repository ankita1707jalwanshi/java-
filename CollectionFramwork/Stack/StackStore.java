
package com.basic.CollectionFramwork.Stack;

import java.util.Stack;

public class StackStore {
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push (12);
        st.push(56);
        st.push(10);
        st.push(21);
        st.push(34);
        st.push(56);
        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st);
//        Iterable<Integer>
//        for(int num: st){
//            System.out.print(num+" ");
//        }
        for(int i = 0; i<st.size();i++){
            System.out.println(st.get(i));
        }
    }

}
