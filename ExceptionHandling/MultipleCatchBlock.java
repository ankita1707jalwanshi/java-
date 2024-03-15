package com.basic.ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        try{
            int a =10;int b= 0;
            int c = a/b;
            System.out.println(c);
            System.out.println("Print Hoga ");
        }
        catch (NullPointerException A){
            System.out.println("kya hoga");
        }
        catch (ArithmeticException B){
            System.out.println(B);
        }
        System.out.println("sb chlega");
    }
}
