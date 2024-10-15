abstract class Vehicle {
    abstract void start(); // Abstract method

    void stop() { // Concrete method
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class AbstractBasic {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Calls overridden method in Car
        car.stop();   // Calls inherited method from Vehicle
    }
}
