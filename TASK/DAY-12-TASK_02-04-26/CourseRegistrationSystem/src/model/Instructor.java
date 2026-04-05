package CourseRegistrationSystem.src.model;
public class Instructor extends User {

    public Instructor(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "Instructor";
    }
}
