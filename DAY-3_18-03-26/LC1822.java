class LC1822 {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int i:nums){
            if(i==0)
                return 0;
            if(i<0)
                prod*=-1;
        }
        if(prod>0)
                 return 1;
        else
        return -1;
    
}
}
