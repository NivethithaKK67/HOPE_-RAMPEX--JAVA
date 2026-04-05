package CourseRegistrationSystem.src.main;

import CourseRegistrationSystem.src.model.*;
import CourseRegistrationSystem.src.service.RegistrationService;
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Shiva","Shiva@mail.com");
        Student s2 = new Student(2,"Parvathi","parvathi@mail.com");

        Course java = new Course(101,"Java Programming",1);
        Course dbms = new Course(102,"DBMS",2);

        RegistrationService service = new RegistrationService();

        service.registerCourse(s1, java);
        service.registerCourse(s1, java);
        service.registerCourse(s2, java);
        service.registerCourse(s2, dbms);

        service.showAllRegistrations();
    }
}