class  Timer1 extends Thread{
    public void run(){
        //System.out.println("Song is getting played");
        // for(int i=0;i<5;i++){
        //     System.out.println("Thread 1 value is "+i);
        // }
        try{
            for(int i=0;i<=5;i++){
                System.out.println("Thread 1 value is "+i);
                Thread.sleep(50);
            }
        }catch (Exception e){
                System.out.println(e);
            }
    }
}
class Timer2 extends Thread{
    int j;
    public void run(){
        int i=0;
        //System.out.println("Timer 2 is running");
        // for(int i=0;i<5;i++){
        //     System.out.println("Thread 2 value is "+i);
        // }
        try{
            for(i=0;i<=5;i++){
                System.out.println("Thread 2 value is "+i);
                Thread.sleep(50);
            }
            }
            catch (Exception e){
                System.out.println(e);
            }
        j=i;
    }
}
public class ThreadImplementation {
    public static void main(String[] args) {
        //Music music = new Music();
        //Timer timer = new Timer();
        //music.start();
        //timer.start();
        Timer1 t1 = new Timer1();
        Timer2 t2 = new Timer2();
        t1.start();
        t2.start();
        try{
            t1.join();
            System.out.println("J value is "+t2.j);
        }catch (Exception e){
            System.out.println(e);
        }
        //System.out.println("J value is "+t2.j);

    }
}

