class Parent{
    int x=10;
    void display(){
        System.out.println("I am inside Parent class but called by child class");
    }
}
class child extends Parent{
    void display1(){
        System.out.println("I am inside child class "+x);
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("I am inside Main Function");
        child c = new child();
        c.display();
        c.display1();
    }
}
