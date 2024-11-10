interface Swimmable {
    void swim();
    void dive();
    void makeSound();
}

abstract class AAnimal {
    abstract void eat();

    void sleep() {
        System.out.println("Animal is sleeping.");
    }

    //abstract void makeSound();
    void makeSound() {
    System.out.println("Animal sound");
    }
}
class Dolphin extends AAnimal implements Swimmable{
    @Override
    public void swim() {

    }
    @Override
    public void dive() {

    }
    @Override
    void eat() {

    }
    @Override
    //public void makeSound() {

    //}
    public void makeSound() {
        super.makeSound(); // Calls AAnimal's makeSound() implementation
    }

}
public class AdAmgo{
    public static void main(String[]args){

    }
}