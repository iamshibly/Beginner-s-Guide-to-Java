public class MethodOverridingByVaribalinsideMethod {
    public static void main(String[]args){
    Animation1 one= new Animation1();
    one.gravity(5);
    Physics two= new Physics();
    two.gravity(4);
    Physics three= new Animation1();
    three.gravity(6);
    }
}
class Physics{
    int a;
    void gravity(int b){
        double g=9.8;
        System.out.println(b+ " gravity: "+g);
    }
}
class Animation1 extends Physics{
    void gravity(int a){
        double g=10;
        System.out.println(a +" gravity: "+g);
    }
}