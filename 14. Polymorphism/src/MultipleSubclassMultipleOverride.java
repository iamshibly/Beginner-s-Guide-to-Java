class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal2 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal2 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal2 {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class MultipleSubclassMultipleOverride {
    public static void main(String[] args) {
        Animal2 myAnimal;  // Declare an Animal reference

        myAnimal = new Dog();  // Dog object
        myAnimal.sound();  // Calls Dog's overridden method

        myAnimal = new Cat();  // Cat object
        myAnimal.sound();  // Calls Cat's overridden method

        myAnimal = new Cow();  // Cow object
        myAnimal.sound();  // Calls Cow's overridden method
    }
}
