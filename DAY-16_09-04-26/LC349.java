import java.util.HashSet;
import java.util.Set;
public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }
        int[] arr = new int[result.size()];
        int i=0;
        for(int num:result){
            arr[i]=num;
            i++;
        }
        return arr;
    }
}
