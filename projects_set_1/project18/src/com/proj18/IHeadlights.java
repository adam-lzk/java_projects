// interface
// they are used to describe in one place the methods that will be used in the class
// remind you which methods should be implemented in the class

package com.proj18;

public interface IHeadlights {
    int brightness = 8;  // the access modifier final is automatically set for the fields - it is a constant => cannot be changed

    void TurnOnHeadlights(boolean turnOn);  // the public access modifier is automatically set for the methods

    void Blinking();
}
