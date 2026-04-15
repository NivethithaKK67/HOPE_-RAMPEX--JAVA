import java.util.*;
public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        Map<Integer, String> set = new LinkedHashMap<>();
        set.put(3, "Three");
        set.put(1, "One");
        set.put(2, "Two");
        System.out.println("LinkedHashMap: " + set);
    }
}
