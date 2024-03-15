package com.basic.ExceptionHandling;   
class Typical{
    void fun() throws  Exception{
        System.out.println("this is throws exa.");
    }
}
public class ThrowsKeyword {

    public static void main(String[] args) {
        Typical obj = new Typical();
        try{
            obj.fun();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
