// parent class

package com.proj12;

public class Automobile {
    private String color;
    private float maxSpeed;
    private int weight;
    private int[] coordinatesInSpace;

    public Automobile() {
        System.out.println("\n\"the object of the Automobile class was created successfully\"");
    }

    public void SetParameters(String color, float maxSpeed, int weight, int[] coordinatesInSpace) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.coordinatesInSpace = coordinatesInSpace;
    }
}
