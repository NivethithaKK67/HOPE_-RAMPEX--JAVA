public class Student {
    private int ID;
    private String NAME;
    private int MARKS;
    // Constructor
    public Student(int ID, String NAME, int MARKS) {
        this.ID = ID;
        this.NAME = NAME;
        this.MARKS = MARKS;
    }
    // getter
    public int getID() {
        return ID;
    }
    public String getNAME() {
        return NAME;
    }
    public int getMARKS() {
        return MARKS;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    public void setMARKS(int MARKS) {
        this.MARKS = MARKS;
    }
}
