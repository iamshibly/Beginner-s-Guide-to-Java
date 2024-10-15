public class InstanceVariablesCanNotBeOverridden {
    public static void main(String []args){
    Animation one= new Animation();
    System.out.println(one.gravity);
    PhysicsAim two= new Animation();
    System.out.println(two.gravity);
    PhysicsAim three= new PhysicsAim();
    System.out.println(three.gravity);
    }
}
class PhysicsAim{
    double gravity = 9.8;
    void bounce(){
        int meter=4;
    }
}
class Animation extends PhysicsAim{
    double gravity = 10;
}

