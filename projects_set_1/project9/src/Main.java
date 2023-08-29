// using a class object

import com.proj9.Automobile;  // importing the class from this package

public class Main {
    public static void main(String[] args) {

        Automobile myAutomobile = new Automobile();
        myAutomobile.maxSpeed = 180.0f;
        myAutomobile.weight = 2500;
        myAutomobile.coordinatesInSpace = new int[] {0, 0, 0};

        System.out.println("\nmaximum speed of my car: " + myAutomobile.maxSpeed + " km/h");

        myAutomobile.SetColor("red");
        String color = myAutomobile.GetColor();
        System.out.println("color is " + color);

    }
}
