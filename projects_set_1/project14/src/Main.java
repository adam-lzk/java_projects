// nested class (doesn't work)

import com.proj14.*;

public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck();
        truck.engine.SetEngineParameters(3f, 8, 2500);  // error: The field Truck.engine is not visible
        truck.engine.PrintParameters();  // error: The field Truck.engine is not visible

    }
}
