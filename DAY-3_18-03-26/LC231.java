class LC231 {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        while((n!=0&&n%2==0)){
           
            if(n/2==2||n/2==1){
            return true;
            }
             n = n/2;
        }
        return false;
        
         
    
    }
}
