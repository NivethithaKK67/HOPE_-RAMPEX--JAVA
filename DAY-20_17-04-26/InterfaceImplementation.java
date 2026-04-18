interface Test{
    public void show(int a,int b);
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        // Test obj=()-> System.out.println("Hello lambda interface");;
        // obj.show(); // Lambda expression without  parameters
        Test obj = (a,b)->System.out.println("Hello Lambda Interface "+(a+b));
        obj.show(10,20);// Lambda expression with parameters
    }
}
