package oops.methods.studentApp;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    public void createStudent() {
        studentDao.createStudent();
    }

    public void updateStudent() {
        studentDao.updateStudent();
    }

    public void readStudent() {
        studentDao.readStudent();
    }

    public void deleteStudent() {
        studentDao.deleteStudent();
    }
}
