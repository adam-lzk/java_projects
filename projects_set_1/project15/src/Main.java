// anonymous class

import com.proj15.*;

public class Main {
    public static void main(String[] args) {

        Truck evacuator = new Truck() {
            @Override  // anonymous method
            public void PrintMaxSpeed(float maxSpeed) {  // you can only rewrite the existing method (you cannot create a new one)
                super.PrintMaxSpeed(maxSpeed);  // using the functionality of the PrintMaxSpeed method of the parent class (optional)

                System.out.println("anonymous method is called"); // here you can add new functionality
            }
        };

        evacuator.PrintMaxSpeed(100);  // using an anonymous method

    }
}