package com.basic.ComparableOperator;

public class Car implements Comparable<Car> {

int speed;

int power;


   public Car(int speed, int power){
    this.speed=speed;
    this.power=power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.power-o.power;
    }
}