class Vehicle {
    void start() {

    }
}

class Car extends Vehicle {
    @Override
    void start() {

    }
}

public class SingleSubclassOverrideOne {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(); // Create a Vehicle object
        myVehicle.start(); // Calls Vehicle's start method

        Car myCar = new Car(); // Create a Car object
        myCar.start(); // Calls Car's overridden start method

        Vehicle myCarAsVehicle = new Car(); // Upcasting
        myCarAsVehicle.start(); // Calls Car's overridden start method
    }
}
