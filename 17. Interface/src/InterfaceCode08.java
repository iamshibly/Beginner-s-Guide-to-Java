public class InterfaceCode08 {
    public static void main(String [] args){
    Class2 ok = new Class2();
    double j= ok.one(5.55);
    int k= ok.two(7);
    float m=ok.three(10,12);
    boolean t= ok.four(true);
    int n=ok.five(4);
    double i= ok.six(8.56);
    System.out.println(j +"\n"+ k+"\n"+ t +"\n"+ n +"\n"+ i+"\n"+m);
    }
}
interface Class1 {
    double one(double a);
    int two(int b);
    float three(int a, int b);
    boolean four(boolean ok);
    int five(int c);
    int six(double d);
}
class Class2 implements Class1{
    @Override
    public double one(double a) {
        return a;
    }
    @Override
    public int two(int b) {
        return b;
    }
    @Override
    public float three(int a, int b) {
        return a+b;
    }
    @Override
    public boolean four(boolean ok) {
        return false;
    }
    @Override
    public int five(int c) {
        return c;
    }
    @Override
    public int six(double d) {
        if(d<5){
        return 0;}
        else{return 5;}
    }
}