class B {
    private String name;

    String getName() {
        return name;
    }

    void setName(String a) {
        name = a;
    }
}
public class Main{
   public static void main(String [] args){
       B b=new B();
       b.setName("Abir");
       System.out.println(b.getName());
   }
}