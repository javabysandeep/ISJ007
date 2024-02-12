package oops.encapsulation;

public class CourseApp {
    public static void main(String[] args) {
        //Course course = new Course();
        Course course = new Course(1, "Java","Ad");
        /*course.courseId = 100;
        course.courseName = "Python";
        course.courseContent = "Core Python and Advance Python";*/
        course.setCourseId(100);
        course.setCourseName("Python");
        course.setCourseContent("core and advance python");
        System.out.println(course.getCourseId());
        System.out.println(course.getCourseName());
        System.out.println(course.getCourseContent());
    }
}
