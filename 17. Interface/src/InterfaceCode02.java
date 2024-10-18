public class InterfaceCode02 {
    public static void main(String [] args){
        MyAnimation ok= new MyAnimation();
        ok.bounce();
        ok.bounce(5);
        ok.fight();
        ok.fight("JOB");
        ok.gravity();
    }
}
interface Animation{
    int a=10,b=5;
    void gravity();
    void bounce();
}
interface Physics{
    int c=11;
    void fight();
}
final class MyAnimation implements Animation,Physics{
    @Override
    public void gravity(){
        System.out.println(a);
    }
    @Override
    public void bounce(){
        System.out.println(b);
    }
    public void bounce(int c){
        System.out.println(b + c);
    }
    @Override
    public void fight() {
        System.out.println(c);
    }
    public void fight(String k) {
        System.out.println(k + c);
    }
}