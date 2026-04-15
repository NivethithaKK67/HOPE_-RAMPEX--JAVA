public class LC1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
      int tb = numBottles;
      while(numBottles>=numExchange){
        int nb = numBottles/numExchange;
        tb+=nb;
        numBottles=nb+(numBottles%numExchange);
      }
      return tb;
    }
}
