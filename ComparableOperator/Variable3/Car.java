package com.basic.ComparableOperator.Variable3;

public class Car{
    int speed;
    int power;
    String name;

    public Car(int speed, int power, String name){
        this.speed = speed;
        this.power = power;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", power=" + power +
                ", name='" + name + '\'' +
                '}';
    }
}

