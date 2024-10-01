public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.reveiew("Akib",5);
        student1.display();
    }
}
class Student{
    String name;
    int cgpa;
    void reveiew(String a, int b){
        cgpa=b;
        name=a;
    }
    void display(){
        System.out.println(name + " is a good student with cgpa of "+ cgpa);
    }
}