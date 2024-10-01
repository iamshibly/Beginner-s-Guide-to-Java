public class Main {
    public static void main(String[] args) {
        Fruits fruit1= new Fruits("Mango","Yellow",250);
        double price=fruit1.totalPaid(10);
        System.out.println(fruit1.color + " "+ fruit1.name+ "'s price for 10kg is " + price);
    }
}
class Fruits{
    String name;
    String color;
    double pricePerKg;
    Fruits(String a,String b, double c){
        name=a;
        color=b;
        pricePerKg=c;
    }
    double totalPaid(int amount){
        return amount*pricePerKg;
    }
}