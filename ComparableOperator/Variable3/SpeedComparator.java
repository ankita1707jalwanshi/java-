package com.basic.ComparableOperator.Variable3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
//        return o1.speed- o2.speed;
        return o1.name.compareTo(o2.name);
    }
}
