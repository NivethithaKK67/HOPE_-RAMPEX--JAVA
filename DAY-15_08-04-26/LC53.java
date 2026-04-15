public class LC53 {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0],currsum=0,i=0;
        for(i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(currsum>maxsum){
                maxsum = currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}
