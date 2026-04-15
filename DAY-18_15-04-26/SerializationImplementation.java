 import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    public static  String val = "Hello";
    public Student(int id,String name){
        this.id = id;
        this.name=name;
    }
}
public class SerializationImplementation {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1009,"Nivethitha");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("confidential.dat"));
        oos.writeObject(s1);
        oos.close();
        Student.val = "Hi";
        System.out.println(s1.val);
        System.out.println("Object serialized");
    }
}
