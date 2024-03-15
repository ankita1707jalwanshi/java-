package com.basic.Assignment.Assignment2.Question2;

public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Dog dg = new Dog();
        Cat ct = new Cat();

        System.out.println("Animal is calling");
        ani.makeSound();
        System.out.println("Dog is calling ");
        dg.makeSound();
        System.out.println("Cat is calling ");
           ct.makeSound();
        }
    }

