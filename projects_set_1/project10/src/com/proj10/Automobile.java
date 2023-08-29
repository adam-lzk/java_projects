// creating constructors

package com.proj10;

public class Automobile {
    private String color;
    private float maxSpeed;
    private int weight;
    private int[] coordinatesInSpace;

    public Automobile() {  // default constructor
        System.out.println("\n\"the object was created successfully\"");
    }

    public Automobile(String color, float maxSpeed, int weight, int[] coordinatesInSpace) {  // constructor
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
