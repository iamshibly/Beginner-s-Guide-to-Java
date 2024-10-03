class Animal{
    String name;
    int age;
    Animal(String a, int b){
        name=a;
        age=b;
    }
    void sleep(){
        System.out.println(" age sleeps at least once a week");
    }
}
class BigAnimal extends Animal{
    boolean agression;
    BigAnimal(String a, int b,boolean c){
        super(a,b);
        agression=c;
    }
    void sleep(){
        System.out.println(" age sleeps at least once per week");
    }

}
public class Main {
    public static void main(String[] args) {
        BigAnimal x= new BigAnimal("Dog",13,true);
        Animal y= new Animal("horse",9);
        Animal z= new BigAnimal("cat",5,true);
        System.out.print(x.name + " of " + x.age);
        x.sleep();
        System.out.print(y.name + " of " + y.age);
        y.sleep();
        System.out.print(z.name + " of " + z.age);
        z.sleep();
    }
}