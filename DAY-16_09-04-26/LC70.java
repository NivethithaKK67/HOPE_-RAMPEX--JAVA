public class LC70 {
    public int climbStairs(int n) {
        if(n<=2) return n;
        
        int a = 1;
        int b = 2;
        int c = 0;
        
        for(int i=3; i<=n; i++){//4
            c = a + b;//5
            a = b;//3
            b = c;//5
        }
        
        return b;
    }
}
