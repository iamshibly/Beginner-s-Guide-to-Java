abstract class A{
    abstract double marks(double a);
    abstract double marks(double a, double b);
}
class B extends A{
    double marks(double a){
        return a;
    }
    double marks(double a, double b){
        return a+b;}
}
public class AbABstract {
    public static void main(String []args){

    }
}
