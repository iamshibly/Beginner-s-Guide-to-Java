public class WithInTheSameClass {
    public static void main(String[]args){
        Forest ok= new Forest();
        ok.abd(3,4);
        ok.abd(5,5);
        ok.abd("Jhon");
    }
}
class Forest{
    void abd(){
    }
    void abd(int a){
    }
    void abd(String a){
    }
    void abd(boolean a){
    }
    void abd(int a, int b){
    }
}
