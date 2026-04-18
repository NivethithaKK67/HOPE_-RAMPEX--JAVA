import java.util.*;
public class SortingLambda {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Cake");
        words.add("Banana");
        words.add("Watermelon");
        words.add("Musk Melon");
        words.add("Grapes");
        words.add("Apple");
        //Collections.sort(words, (a, b) -> a.compareTo(b));
        //Collections.sort(words, (a, b) -> b.compareTo(a));
        //Collections.sort(words,(a,b)->b.compareTo(a));
        words.sort(String::compareTo);//It sorted alphabetically
         // words.sort(String::compareTo); // asc // task->change this line to printing in reverse order
        // words.sort(Comparator.reverseOrder());
        // words.forEach((i) -> System.out.println(i));
       System.out.println(words);
    }
}
