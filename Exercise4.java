import java.util.*;
//Java program to get the number of elements in a hash set
public class Exercise4 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        System.out.println("Size of the Hash Set: " + h_set.size());
    }
}
