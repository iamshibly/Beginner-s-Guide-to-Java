interface Vehicle {
    void start();
    void stop();
    void accelerate(int speed);
    default String fuelType() {
        return "Gasoline";
    }
}

abstract class Engine implements Vehicle {
    String type;
    int horsepower;

    Engine(String t, int hp) {
        this.type = t;
        this.horsepower = hp;
    }

    abstract void displayEngineSpecs();

    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

abstract class Car extends Engine {
    String model;
    int year;

    Car(String t, int hp, String m, int y) {
        super(t, hp);
        this.model = m;
        this.year = y;
    }

    abstract void displayCarInfo();
    public void accelerate(int speed) {
    }
    public void accelerate(int speed, double fuelConsumption) {
        System.out.println("Accelerating to " + speed + " km/h with fuel consumption: " + fuelConsumption + "L/km");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void start() {
        startEngine();
        System.out.println("Car started");
    }
}

class SportsCar extends Car {
    boolean turbo;

    SportsCar(String t, int hp, String m, int y, boolean tb) {
        super(t, hp, m, y);
        this.turbo = tb;
    }

    void displayCarInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Turbo: " + turbo);
    }
    void displayEngineSpecs(){}
    void displayEngineSpecs(int cylinders) {
        System.out.println("Engine Type: " + type + ", Horsepower: " + horsepower + ", Cylinders: " + cylinders);
    }

    public void accelerate(int speed) {
        System.out.println("Sports car accelerating to " + speed + " km/h");
    }

    void activateTurbo() {
        if (turbo) {
            System.out.println("Turbo activated!");
        } else {
            System.out.println("This car doesn't have turbo.");
        }
    }
}

public class TestVehicles {
    public static void main(String[] args) {
        Car myCar = new SportsCar("Ferrari", 2020, "V8", 700,false);
        myCar.displayCarInfo();
        myCar.accelerate(100);

        SportsCar sc = new SportsCar("Porsche", 2021, "V6", 550, true);
        sc.displayEngineSpecs();
        sc.activateTurbo();
        sc.accelerate(200, 12.5);

        SportsCar v = new SportsCar("Lamborghini", 2022, "V10", 640, false);
        String m= v.fuelType();
        System.out.println(m);
    }
}
