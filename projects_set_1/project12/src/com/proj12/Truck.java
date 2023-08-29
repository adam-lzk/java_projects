// implementation of polymorphism

package com.proj12;

public class Truck extends Automobile {
    private int loadCapacity;

    public Truck() {
        System.out.println("\n\"the object of the Truck class was created successfully\"");
    }

    @Override  // adding functionality to the parent method
    public void SetParameters(String color, float maxSpeed, int weight, int[] coordinatesInSpace) {
        super.SetParameters(color, maxSpeed, weight, coordinatesInSpace);  // using the parent SetParameters method
        System.out.println("\n\"the Truck.SetParameters method is called\"");  // additional functionality
    }

    public void SetMoreParameters(String color, float maxSpeed, int weight, int[] coordinatesInSpace, int loadCapacity) {
        super.SetParameters(color, maxSpeed, weight, coordinatesInSpace);
        this.loadCapacity = loadCapacity;
    }
}
