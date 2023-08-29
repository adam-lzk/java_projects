// inheritance of classes using super();  heir class

package com.proj11;

public class Truck extends Automobile {
    private int loadCapacity;

    public Truck() {
        System.out.println("\n\"the object of the Truck class was created successfully\"");
    }

    public Truck(String color, float maxSpeed, int weight, int[] coordinatesInSpace, int loadCapacity) {  // constructors are not inherited
        super(color, maxSpeed, weight, coordinatesInSpace);  // accessing the parent class (passing parameters to the constructor of the parent class)
        this.loadCapacity = loadCapacity;

        // this.color - use a field/method inside this class
        // super.color - use the parent class field/method (if the field/method is public/protected)

        PrintAdditionalCharacteristics();
    }

    private void PrintAdditionalCharacteristics() {
        System.out.println("loadCapacity: " + loadCapacity);
    }
}
