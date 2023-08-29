// parent class

package com.proj11;

public class Automobile {
    private String color;
    private float maxSpeed;
    private int weight;
    private int[] coordinatesInSpace;

    public Automobile() {
        System.out.println("\n\"the object of the Automobile class was created successfully\"");
    }

    public Automobile(String color, float maxSpeed, int weight, int[] coordinatesInSpace) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.coordinatesInSpace = coordinatesInSpace;

        PrintCharacteristics();
    }

    private void PrintCharacteristics() {
        System.out.println("\ncolor: " + color + "\nmaxSpeed: " + maxSpeed + "\nweight: " + weight);
        System.out.println("coordinatesInSpace: (" + coordinatesInSpace[0] + ", " + coordinatesInSpace[1] + ", " + coordinatesInSpace[2] + ")");
    }
}
