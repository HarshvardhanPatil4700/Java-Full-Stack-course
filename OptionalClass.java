// Optional class in Java (introduced in Java 8) is a container object that may or may not hold a non-null value.Its main goal avoid NullPointerException and write cleaner, safer code.
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishan");

        // String name = names.stream()
        //                     .filter(str -> str.contains("x"))
        //                     .findFirst(); // the findfirst returns Optional object so, it gives error for String

        Optional<String> name = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst(); 
        System.out.println(name); // gives the Object
        System.out.println(name.get()); // If a value is present, returns the value, otherwise throws NoSuchElementException.Eg: if in this example "laxmi" is written as "lakshmi" then it throws NoSuchElementException But the exception can be avoided by using .orElse() method as :
        System.out.println(name.orElse("Not found")); // to view this effect, make string "lakshmi" and comment above lines

        // Note : the .orElse() can also be added in Optional definition after findFirst() But we need to make the Optional object to data type which will be return by .orElse as:
        List<String> names1 = Arrays.asList("Navin", "Lakshmi", "John", "Kishan");
        String name2 = names1.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not found"); // returns "Not found" if condition is not satisified by any elements of List else return the element

        System.out.println(name2);

    }
}
