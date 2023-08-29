// using abstract method

package com.proj13;

public class Truck extends Automobile {
    private int loadCapacity;

    public Truck() {
        System.out.println("\n\"the object of the Truck class was created successfully\"");
    }

    @Override
    public void PrintMaxSpeed(float maxSpeed) {  // using an abstract method
        System.out.println("\nmaxSpeed: " + maxSpeed);
    }
    // if you don't add this method to a heir class, the compiler will throw an error
}
