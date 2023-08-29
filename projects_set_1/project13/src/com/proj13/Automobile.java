// parent class

package com.proj13;

public abstract class Automobile {
    private String color;
    private float maxSpeed;
    private int weight;
    private int[] coordinatesInSpace;

    public Automobile() {
        System.out.println("\n\"the object of the Automobile class was created successfully\"");
    }

    public abstract void PrintMaxSpeed(float maxSpeed);  // abstract method
    // serves as a reminder not to forget to add this method to future heir classes
    // in each heir class, the implementation of this method may differ
}
