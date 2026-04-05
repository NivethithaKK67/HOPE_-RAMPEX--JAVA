package CourseRegistrationSystem.src.model;
public abstract class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");

        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getEmail(){ return email; }

    public abstract String getRole();
}
