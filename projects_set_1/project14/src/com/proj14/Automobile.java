// nested class implementation

package com.proj14;

public abstract class Automobile {
    private String color;
    private float maxSpeed;
    private int weight;
    private int[] coordinatesInSpace;

    public Automobile() {
        System.out.println("\n\"the object of the Automobile class was created successfully\"");
    }

    class Engine {  // nested class
        private float volume;
        private int numberOfCylinders;
        private int frequencyOfRotation;

        public void SetEngineParameters(float  volume, int numberOfCylinders, int frequencyOfRotation) {
            this.volume = volume;
            this.numberOfCylinders = numberOfCylinders;
            this.frequencyOfRotation = frequencyOfRotation;
        }

        public void PrintParameters() {
            System.out.println("\nvolume: " + this.volume);
            System.out.println("numberOfCylinders: " + this.numberOfCylinders);
            System.out.println("frequencyOfRotation: " + this.frequencyOfRotation);
        }

    }

}
