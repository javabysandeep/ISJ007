package oops.constructor;

public class Student {
    int id;
    String name;

    //zero parameterized constructor provided by developer
    Student() {
        id = 101;
        name = "abc";
        System.out.println("zero param");
    }

    Student(int i, String n) {
        //assign local variable value to instance variable
        id = i;
        name = n;
    }


    public Student(Student student1) {
        id = student1.id;
        name = student1.name;
    }
}
