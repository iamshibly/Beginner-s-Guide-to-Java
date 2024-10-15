class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

abstract class Mammal extends Animal {
    // Abstract method to be implemented by subclasses
    abstract void sound();
}

class Dog extends Mammal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractasBothParentnChild {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.sound(); // Implemented by Dog
    }
}
