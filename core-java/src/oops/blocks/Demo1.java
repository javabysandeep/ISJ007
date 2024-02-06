package oops.blocks;

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");
        Student student3 = new Student(1, "abc");
        Student student4 = new Student(1, "abc");
        Student student5 = new Student(1, "abc");
        Student student6 = new Student(1, "abc");
        accept();
        System.out.println("Total Student class objects  created " + Student.studentObjectCreationCount);

    }

    public static void accept() {
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");
        Student student3 = new Student(1, "abc");
        Student student4 = new Student(1, "abc");
        Student student5 = new Student(1, "abc");
        Student student6 = new Student(1, "abc");
    }
}
