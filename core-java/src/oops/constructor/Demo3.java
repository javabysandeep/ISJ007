package oops.constructor;

public class Demo3 {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Rohit");
        Student student2 = new Student(student1);
    }
}
