// adding a nested class

package com.proj14;

public class Truck extends Automobile {
    private int loadCapacity;

    Engine engine = new Engine();

    public Truck() {
        System.out.println("\n\"the object of the Truck class was created successfully\"");
    }

}
