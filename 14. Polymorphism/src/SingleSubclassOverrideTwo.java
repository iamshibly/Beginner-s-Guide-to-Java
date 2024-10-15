class Vehicle1 {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car1 extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

public class SingleSubclassOverrideTwo {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(); // Create a Vehicle object
        myVehicle.start(); // Calls Vehicle's start method

        Car1 myCar = new Car1(); // Create a Car object
        myCar.start(); // Calls Car's overridden start method

        Vehicle1 myCarAsVehicle = new Car1(); // Upcasting
        myCarAsVehicle.start(); // Calls Car's overridden start method
    }
}
