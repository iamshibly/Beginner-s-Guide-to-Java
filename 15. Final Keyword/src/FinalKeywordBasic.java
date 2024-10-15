public class FinalKeywordBasic {
    public static void main(String[] args) {
        PhysicsAnim A = new PhysicsAnim();
        System.out.println(A.pi);
    }
}
class PhysicsAnim{
    final double pi=3.1416;
    void bounch(){
        int a=4;
    }
    final void gravity(){
        double g=9.8;
    }
}
class A extends PhysicsAnim{
   // void gravity(){//error
      //  double g=9.8;
   // }
    //void add(){//error
    //    pi=6;
    //}

}