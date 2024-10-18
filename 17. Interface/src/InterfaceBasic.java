interface Vehicle {
    // Constants
    int Max_Speed=130;

    // Abstract Methods
    void start();
    void stop();

    // Default Method
    default void honk() {
        System.out.println("Vehicle is honking...");
    }

    // Static Method
    static void serviceInfo() {
        System.out.println("Vehicle service information");
    }

    // Nested Class
    class Engine {
        void start() {
            System.out.println("Engine started");
        }
    }
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        // Create an instance of Car, which implements Vehicle
        Vehicle car = new Car();

        // Use abstract method implementations
        car.start();
        car.honk();  // Using default method
        car.stop();

        // Call the static method from the interface
        Vehicle.serviceInfo();

        // Use the nested class inside the interface
        Vehicle.Engine engine = new Vehicle.Engine();
        engine.start();

        // Display constant value
        System.out.println("Max speed: " +Vehicle.Max_Speed);
    }
}