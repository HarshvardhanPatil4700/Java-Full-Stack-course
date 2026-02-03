// (Method references are a shorter & cleaner way to write lambda expressions). Introduced in Java 8, method references use the :: operator. Syntax - ClassName::staticMethod
// Eg : System.out::println

import java.util.Arrays;
import java.util.List;

class MathUtil {
    static int square(int x) {
        return x * x;
    }
}

public class MethodReferences {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harsh", "Navin", "Raj");
        // WKT, we need to change the variable of map using a method so we can do it as :
        List<String> uppercaseNames = names.stream()
                                            // .map(str -> str.toUpperCase())
                                            .map(String::toUpperCase)
                                            .toList(); // Accumulates the elements of this stream into a List.

        // uppercaseNames.forEach(i -> System.out.println(i)); even this can be written using method reference as :
        uppercaseNames.forEach(System.out::println);

        List<Integer> nums = Arrays.asList(2, 3, 4);
        nums.stream()
            .map(MathUtil::square)
            .forEach(System.out::println);
            
        
    }
}
/* Other types of Method references :
2. Reference to an instance method of a particular object
Syntax - object::instanceMethod
Example -
class Printer {
    void print(String s) {
        System.out.println(s);
    }
}

Printer p = new Printer();
List<String> names = Arrays.asList("Java", "Python");

names.forEach(p::print);

3. Reference to an instance method of an arbitrary object
Syntax - ClassName::instanceMethod
Example -
List<String> names = Arrays.asList("navin", "john", "harsh");

names.stream()
    .map(String::toUpperCase)
    .forEach(System.out::println);


Here, method is called on each element of the stream.

4. Reference to a constructor
Syntax - ClassName::new
Example -
List<String> names = Arrays.asList("A", "B", "C");

List<StringBuilder> builders = names.stream()
         .map(StringBuilder::new)
         .toList(); 
*/