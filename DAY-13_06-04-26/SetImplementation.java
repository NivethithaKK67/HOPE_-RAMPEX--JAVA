import java.util.*;
public class SetImplementation {
    public static void main(String[] args) {
    // Set<Integer> set = new HashSet<>();
    // Integer a = 1;
    // set.add(a);
    // System.out.println(set);
    // set.add(2);
    // System.out.println(set);
    // System.out.println(a.hashCode());
    // System.out.println(set.contains(1));
     Set<String> set = new HashSet<>();
     set.add("KSP");
     System.out.println(set);
     set.add("Rampex");
     System.out.println(set);
     set.add("Alan");
     set.add("Akashya");
     set.add("Edlyn");
     System.out.println(set);
     for(String str : set){
        System.out.println(str);
     }
    }
}