package com.basic.ExceptionHandling;

public class Throwexception {
    public static void main(String[] args) {
        int a =10;int b= 2;
        int c = a/b;
        if(b==0){
            throw new ArithmeticException();
        }else {
            System.out.println(c);
        }

        System.out.println("Print Hoga ");


    }
}
