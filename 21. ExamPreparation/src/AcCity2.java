interface Vehicle {
    void start();
    void stop();
}

abstract class Car {
    abstract void fuelUp();

    void start() {
        System.out.println("Car started");
    }

    void openDoor() {
        System.out.println("Door opened");
    }
}

class ElectricCar extends Car implements Vehicle {
    @Override
    void fuelUp() {
        System.out.println("lol");
    }
    void charge(){
        System.out.println("Necessary");
    }
    @Override
    public void stop() {

    }
    @Override
    public void start() {
        System.out.println("Electric car started");
    }
   // @Override
    //public void start() {
        // Call the start() method from Car
        //super.start();  // This calls Car's start() method
        //System.out.println("Additional startup steps for ElectricCar");
    //}
}
public class AcCity2{
    public static void main(String[]args){
        ElectricCar j = new ElectricCar();
        j.start();

    }
}