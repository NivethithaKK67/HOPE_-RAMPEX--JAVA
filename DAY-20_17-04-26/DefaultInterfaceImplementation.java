interface method{
    default void display(){
        System.out.println("Welcome to Interface Implementation");
    }
}
class hello implements method{
    public void display(){
        System.out.println("Overrided the orignal interface method");
    }
}
public class DefaultInterfaceImplementation {
    public static void main(String[] args) {
        hello h = new hello();
        h.display();
    }
}
