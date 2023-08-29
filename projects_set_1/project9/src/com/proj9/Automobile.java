// creating a class

package com.proj9;  // specifying the package

public class Automobile {
    private String color;
    public float maxSpeed;
    public int weight;
    public int[] coordinatesInSpace;

    public void SetColor (String newColor) {
        color = newColor;
    }

    public String GetColor () {
        return color;
    }

}
