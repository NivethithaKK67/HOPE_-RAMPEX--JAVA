package CourseRegistrationSystem.src.model;
public class Course {
    private int courseId;
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    public Course(int courseId, String courseName, int capacity) {
        if(capacity <= 0)
            throw new IllegalArgumentException("Capacity must be > 0");

        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public int getCourseId(){ return courseId; }
    public String getCourseName(){ return courseName; }
    public int getCapacity(){ return capacity; }
    public int getEnrolledStudents(){ return enrolledStudents; }

    public boolean isFull(){
        return enrolledStudents >= capacity;
    }

    public void enrollStudent(){
        if(isFull())
            throw new IllegalStateException("Course is full");
        enrolledStudents++;
    }
}
