class Bank {
    int balance = 1000;
    void Withdraw(int amount) {
    //synchronized void Withdraw(int amount) {
        if(balance >= amount) {
            System.out.println( Thread.currentThread().getName()+" is withdrawing " );
            balance -= amount;
            System.out.println(" Remaining Amount is: " + balance);
        } else {
            System.out.println("Insufficient balance..... " );
        }
    }
}
public class Concurrency {
    public static void main(String[] args)  {
        Bank b = new Bank();
        Runnable task = () ->{
            b.Withdraw(700);
        };
        Thread t1 = new Thread(task,"User 1");
        Thread t2 = new Thread(task,"User 2");
        // t1.start();
        // t2.start();
         t1.start();
       try {
        t1.join();
       } catch (Exception e) {
        e.printStackTrace();
       }
       t2.start();
    }
}
