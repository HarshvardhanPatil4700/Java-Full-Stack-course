import java.util.*;
import java.util.stream.*;
 
public class CE13 {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
 
        // TODO: Print the original list
        // System.out.println("Original List: " + products);
        // products.forEach(str -> System.out.println(str));
        products.forEach(System.out::println);
 
        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> filtered = products.stream()
            .filter(p -> p.length() > 5)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());
 
        // TODO: Print the filtered list
        System.out.println("Filtered Products: " + filtered);
    }
}