package oops.encapsulation;


public class Course {
    private int courseId;
    private String courseName;
    private String courseContent;

    public Course() {
    }

    public Course(int courseId, String courseName, String courseContent) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseContent = courseContent;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }
}
