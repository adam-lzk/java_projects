// polymorphism

import com.proj12.*;

public class Main {
    public static void main(String[] args) {

        Automobile auto = new Automobile();

        Truck truck = new Truck();
        truck.SetParameters("blue", 130, 6000, new int[] {0, 0, 0});  // using of method of the heir class
        truck.SetMoreParameters("blue", 130, 6000, new int[] {0, 0, 0}, 2000);

    }
}
