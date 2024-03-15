
package com.basic.CollectionFramwork.Generic;

public class Box<T> {
    T container;
    Box( T container){
        this.container = container;
    }
    public T getContainer(){
        return container;
    }
}
