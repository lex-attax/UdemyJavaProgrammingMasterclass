package com.company;

public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(int doors, int engineCapacity) {
        //super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
