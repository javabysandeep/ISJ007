package oops;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student = new Student();//--> (1, abc, pune)

        student.id = 101;
        student.name = "kartik";
        student.address = "mumbai";

        System.out.println("Student ID = "+student.id);
        System.out.println("Student Name = "+student.name);
        System.out.println("Student Address = "+student.address);
    }
}
