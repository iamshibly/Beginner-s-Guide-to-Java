public class FinalClass {
    public static void main(String[]args){

    }
}
class ami{
    int z;
    ami(int z){
        this.z=z;
    }
    void weight(){
        int w=10;
    }
}
final class Joss extends ami {
    void weight(){
    }
    int a;
    Joss(int z, int a){
        super(z);
        this.a=a;
    }
    void b(){
        int b=9;
    }
}
//class parena extends Joss{

//}
