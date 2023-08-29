// inheritance

import com.proj11.*;  // importing all classes from this package

public class Main {
    public static void main(String[] args) {

        Automobile auto1 = new Automobile();
        Automobile auto2 = new Automobile("red", 180.0f, 2500, new int[] {0, 0, 0});

        Truck truck1 = new Truck();
        Truck truck2 = new Truck("black", 120.0f, 5000, new int[] {0, 0, 0}, 2000);

    }
}
