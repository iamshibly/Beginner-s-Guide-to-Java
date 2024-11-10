class Animal{
    final int age = 10;
    int size;
    boolean death;
    Animal(int size, boolean death){
        this.size=size;
        this.death=death;
    }
    void fast(){
        System.out.println("Pretty Fast");
    }
    void slow(){
        System.out.println("Very Slow");
    }
    boolean extinct(){
        return true;
    }
    int weight(int m){
        return m;
    }
}
class Lion extends Animal{
    String king;
    Lion(int size, boolean death, String king){
        super(size,death);
        this.king=king;
    }
    @Override
    void fast() {
        System.out.println("Intermediate Fast");
    }
    @Override
    int weight(int m){
        return m;
    }
    int weight(int m, int n){
        return m-n;
    }
    String cat(){
        return "Family";
    }
}
public class AaClassPolyInheriFinal{
    public static void main(String []args){
        Lion family = new Lion(10, false, "Yes");
        int x = family.age;
        family.fast();
        int y = family.weight(10,5);
        String z = family.cat();
        boolean p = family.extinct();
        System.out.println(x + "  " + y+ "  "+ z +"  "+ p +"  ");
    }
}