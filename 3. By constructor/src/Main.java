public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(23,4.75);
        student1.print();
    }
}
class Student{
    int id;
    double cgpa;
    Student(int a, double b){
        id=a;
        cgpa=b;
    }
    void print(){
        System.out.println("Id number "+ id + " has cgpa of " + cgpa);
    }
}
