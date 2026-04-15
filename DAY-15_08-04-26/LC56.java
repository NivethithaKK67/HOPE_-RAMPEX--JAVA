import java.util.*;
public class LC56 {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int[] current=intervals[0];
        int n=intervals.length;
        for(int i=1;i<n;i++){
            if(current[1]>=intervals[i][0]){
                current[1]=Math.max(current[1],intervals[i][1]);
            }else{
                ans.add(current);
                current=intervals[i];
            }
        }
        ans.add(current); // last interval
        int len=ans.size();
        int[][] result=new int[len][2];
        int i=0;
        for(int[] arr:ans){
            result[i]=arr;
            i++;
        }
        return result;
}
}
