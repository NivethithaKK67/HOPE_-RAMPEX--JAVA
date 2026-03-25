import java.util.Scanner;
public class GradingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marks = sc.next();
        switch (marks) {
            case "A":
                System.out.println("Distinction");
                break;
            case "B":
                System.out.println("First Class");
                break;
            case "C":
                System.out.println("Second Class");
                break;
            case "D":
                System.out.println("Third Class");
                break;
            default:
                System.out.println("oops Try again");
                break;
        }
        sc.close();
    }
}