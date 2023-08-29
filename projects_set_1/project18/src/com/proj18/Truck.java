// implementation of interface

package com.proj18;

public class Truck extends Automobile implements IHeadlights {
    private int loadCapacity;
    private boolean isHeadlightsOn;

    @Override
    public void TurnOnHeadlights(boolean turnOn) {
        this.isHeadlightsOn = turnOn;
    }

    @Override
    public void Blinking() {
        System.out.println("\nblink, blink");
    }

}
