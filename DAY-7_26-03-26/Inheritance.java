class animal{
    void display(){
        System.out.println();
    }
}
class Dog{
    void bark(){
        System.out.println("Dog Barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog sound = new Dog();
        sound.bark();
        System.out.println(sound.hashCode());
    }
}
