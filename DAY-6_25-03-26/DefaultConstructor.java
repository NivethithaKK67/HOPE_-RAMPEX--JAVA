class DConstruct {
    DConstruct(){
        System.out.println("I ma inside the DefaultConstructor");
    }
    DConstruct(int x){
        System.out.println("I am inside the parameterized constructor and the value is "+x);
    }
}
    public class DefaultConstructor {
    public static void main(String[] args) {
        System.out.println("See your default constructor.");
        DConstruct dc = new DConstruct(10);
        System.out.println(dc);

    }
}
