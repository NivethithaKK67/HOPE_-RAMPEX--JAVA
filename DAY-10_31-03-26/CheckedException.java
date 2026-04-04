

public class CheckedException {
    public static void main(String[] args) {
        try{
        int[] b = new int[10];
        b[15]=10;

        System.out.println(b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Completed");
        }
    }
}