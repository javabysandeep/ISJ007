package oops.variables;

public class StudentTest {
    public static void main(String[] args) {
        int a = 100;
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        //1. accessing local variables
        System.out.println("Local variable " + a);

        //2. accessing instance variables
        System.out.println("Instace variables "+student1.id);
        System.out.println("Instace variables "+student1.name);
        System.out.println("Instace variables "+student1.address);

        //3. accessing static variable
        System.out.println("Static variable "+Student.collegeName);

        //not recommended
        System.out.println("static variable "+student1.collegeName);
    }
}
