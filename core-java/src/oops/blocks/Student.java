package oops.blocks;

public class Student {
    int id;
    String name;
    static int studentObjectCreationCount = 0;

    //instance blocks
    {
        studentObjectCreationCount++;
    }

    public Student() {
        //studentObjectCreationCount++;
    }

    public Student(int id, String name) {
//        studentObjectCreationCount++;
        this.id = id;
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
//        studentObjectCreationCount++;
    }

    public Student(String name) {
        this.name = name;
//        studentObjectCreationCount++;
    }
}
