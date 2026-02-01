import java.util.*;
 
public class Exercise {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
        System.out.println("Original List: " + names);
 
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println("Unique Names: " + uniqueNames);
    }
}