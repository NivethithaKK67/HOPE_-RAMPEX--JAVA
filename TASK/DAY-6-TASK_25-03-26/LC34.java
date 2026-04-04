public class LC34 {
    public static int[] searchrange(int[] nums,int target){
        int[] res=new int[]{-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                int j=i;
                while(j<nums.length&&nums[j]==target){
                    j++;
                }
                res[1]=j-1;
                break;

            }
        }
        return res;
    }
}
