package com.basic.ExceptionHandling.UserDefineException;

public class UnderAgeException extends Exception{
    UnderAgeException(){
        super("you are under age");
    }
}
