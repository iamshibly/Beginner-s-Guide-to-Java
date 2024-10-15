abstract class Vehicle2 {
    String color;

    Vehicle2(String color) {
        this.color = color;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void start();

    // Final method (cannot be overridden)
    final void displayColor() {
        System.out.println("The color of the vehicle is: " + color);
    }
}

class Car2 extends Vehicle2 {
    Car2(String color) {
        super(color);
    }

    @Override
    void start() {
        System.out.println("Car is starting.");
    }
}

class Truck2 extends Vehicle2 {
    Truck2(String color) {
        super(color);
    }

    @Override
    void start() {
        System.out.println("Truck is starting.");
    }
}

public class AbstractAndFinal {
    public static void main(String[] args) {
        Vehicle2 car = new Car2("Red");
        car.start(); // Output: Car is starting.
        car.displayColor(); // Output: The color of the vehicle is: Red

        Vehicle2 truck = new Truck2("Blue");
        truck.start(); // Output: Truck is starting.
        truck.displayColor(); // Output: The color of the vehicle is: Blue
    }
}
