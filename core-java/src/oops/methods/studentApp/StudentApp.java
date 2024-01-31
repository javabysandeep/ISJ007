package oops.methods.studentApp;

public class StudentApp {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.createStudent();
        studentController.updateStudent();
        studentController.readStudent();
        studentController.deleteStudent();
    }
}
