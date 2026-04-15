import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
         //Set<String> set=new LinkedHashSet<>();
        // set.add("KSP");
        // System.out.println(set);
        // set.add("RampeX");
        // System.out.println(set);
        // set.add("Aishu");
        // set.add("Akshaya");
        // set.add("Edlyn");
        // System.out.println(set);
        // for(String str:set){
        //     System.out.println(str);
        // }
        //  set.add("RampeX");
        //  set.add("Ksp");
        //  set.add("Edlyn");
        //  set.add("Akshaya");
        // System.out.println(set);
        Integer a=1;
        Set<Integer> set = new LinkedHashSet<>();
        set.add(a);
        System.out.println(set.hashCode());
        set.add(0);
        System.out.println(set);
        System.out.println(set.contains(1));
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Shivani");
        set1.add("Sravani");
        set1.add("pavani");
        set1.add("KSP");
        System.out.println(set1);
        System.out.println(set1.hashCode());
        for(String s:set1){
            System.out.println(s);
        }
}
}
