import java.util.*;
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollNo- s.rollNo;
    }
}
public class ComparableImplementation {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(10,"John"));
        list.add(new Student(5,"Alice"));
        list.add(new Student(15,"Bob"));
        Collections.sort(list);
        for(Student s : list) {
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}
