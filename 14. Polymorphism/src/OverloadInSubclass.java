public class OverloadInSubclass {
    public static void main(String[]args){
        Zoo no= new Zoo();
        no.add(3,4);
        no.add(5,5);
        no.add("Jhon");
    }
}
class Animal{
    int age;
    void add(){

    }
}
class Zoo extends Animal{
    void add(int a){
    }
    void add(String a){
    }
    void add(boolean a){
    }
    void add(int a, int b){
    }
}
