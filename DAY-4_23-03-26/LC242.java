import java.util.Arrays;
class LC242 {
    public boolean isAnagram(String s, String t) {
        char[] a1=s.toCharArray();
        char [] a2=t.toCharArray();
        int l1=a1.length;
        int l2=a2.length;
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(l1==l2)
        {
            if(Arrays.equals(a1,a2))
            {
                return true;
            }
        }
        return false;
        
    }
}
