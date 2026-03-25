class LC1217 {
    public int minCostToMoveChips(int[] position) {
       int ec=0,oc=0;
       for(int i: position){
        if(i%2==0){
            ec++;
        }else if(i%2!=0){
            oc++;
        }
       }
       return Math.min(ec,oc);
    }
}
