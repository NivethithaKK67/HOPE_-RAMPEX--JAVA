package CourseRegistrationSystem.src.service;
import java.util.*;

import CourseRegistrationSystem.src.model.*;

public class RegistrationService {

    private List<Registration> registrations = new ArrayList<>();

    public void registerCourse(Student student, Course course) {

        try {
            for(Registration r : registrations){
                if(r.getStudent().getId() == student.getId() &&
                r.getCourse().getCourseId() == course.getCourseId()){
                    throw new IllegalStateException("Student already registered!");
                }
            }

            course.enrollStudent();

            Registration reg = new Registration(student, course);
            registrations.add(reg);

            System.out.println(student.getName() +
                    " successfully registered for " +
                    course.getCourseName());

        } catch(Exception e){
            System.out.println("Registration Failed: " + e.getMessage());
        }
    }

    public void showAllRegistrations(){
        System.out.println("\n--- All Registrations ---");
        for(Registration r : registrations){
            System.out.println(r.getStudent().getName()
                    + " -> " + r.getCourse().getCourseName());
        }
    }
}
