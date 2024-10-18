public class InterfaceCode03 {
    public static void main(String [] args){
        OurAnimation op = new OurAnimation();
        op.fly();
        op.fly("DOne");
        op.jump();
        op.pressure();
    }
}
interface HigherAnimation{
    void jump();
}
interface Animations extends HigherAnimation{
    int a=4;
    void pressure();
}
interface RealPhysics{
    void fly();
}
class OurAnimation implements Animations,RealPhysics{
    @Override
    public void jump() {
        System.out.println(a+a+a+a);
    }
    @Override
    public void pressure() {
        System.out.println(a+a+a);
    }
    @Override
    public void fly() {
        System.out.println(a+a);
    }
    public void fly(String a) {
        System.out.println(a+a+ this.a);
    }
}