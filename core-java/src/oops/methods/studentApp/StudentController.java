package oops.methods.studentApp;

public class StudentController {
    StudentService studentService = new StudentService();
    public void createStudent() {
        studentService.createStudent();
    }

    public void updateStudent() {
        studentService.updateStudent();
    }

    public void readStudent() {
        studentService.readStudent();
    }

    public void deleteStudent() {
        studentService.deleteStudent();
    }
}
