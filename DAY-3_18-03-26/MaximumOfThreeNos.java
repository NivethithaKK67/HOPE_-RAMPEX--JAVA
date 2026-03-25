import java.util.*;
public class MaximumOfThreeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" is larger number");
        }else if(b>c){
            System.out.println(b+" is larger number");
        }else{
            System.out.println(c+" is larger number");
        }
        sc.close();
    }
}
