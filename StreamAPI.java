// Stream API (Java 8+) is used to process collections of data (List, Set, Map, Arrays) in a functional, declarative way

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> s1 = nums.stream(); // Returns a sequential Stream with this collection as its source.
        // System.out.println(s1); stream does not support it.
        s1.forEach(n -> System.out.print(n + " ")); // ALLOWED
        // s1.forEach(n -> System.out.print(n + " ")); Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed (Stream cannot be reused)

        // Methods of Stream : They return the stream
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> s = nums1.stream();
        System.out.println();
        // 1. filter(condition) - selects elements that satisfy a given condition
        Stream<Integer> s2 = s.filter(n -> n%2 == 0); // 2, 4, 6

        // 2. map() → transforms each element into another form. eg : here, n is transformed to n*2
        Stream<Integer> s3 = s2.map(n -> n*2); // 4, 8, 12
        s3.forEach(n -> System.out.println(n));

        // 3. sorted() → arranges elements in a defined order
        List<Integer> marks = Arrays.asList(70,30,45,90,20,95,60);
        marks.forEach(n -> System.out.print(n + " "));
        Stream<Integer> sortMarks = marks.stream().sorted();
        System.out.print("\nSorted Marks : ");
        sortMarks.forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        // to sort in reverse order : 
        List<Integer> marks1 = Arrays.asList(45, 78, 12, 90, 60);
        marks1.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(n -> System.out.print(n + " "));

        System.out.println();
        
        // distinct() - removes duplicate elements : 
        List<Integer> rollNo = Arrays.asList(25,30,25,12,18,45,25,80,30);
        Stream<Integer> s4 = rollNo.stream().distinct(); // else create a stream of list and then use .distinct on the created stream
        s4.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // limit() → restricts the number of elements processed (Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length)
        List<Integer> rollNo1 = Arrays.asList(25,30,25,12,18,45,25,80,30);
        Stream<Integer> s5 = rollNo1.stream().limit(3);
        s5.forEach(n -> System.out.println(n));

        // Terminal operations - return a result, not stream 
        // reduce() - Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value.
        List<Integer> rollNos = Arrays.asList(25,30,25,12,18,45,25,80,30);
        Stream<Integer> s6 = rollNos.stream();
        Integer sum = rollNos.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        // multiple operations on stream can be written as : For stream of prime nos. 
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        num.stream()
        .filter(n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        })
        .forEach(n -> System.out.print(n + " "));
    }
}
/*
Methods return a stream
| **Method**           | **Purpose / Description**              | **Example**                                  |
| -------------------- | -------------------------------------- | -------------------------------------------- |
| `filter(Predicate)`  | Keep elements that match a condition   | `nums.stream().filter(n -> n % 2 == 0)`      |
| `map(Function)`      | Transform each element                 | `nums.stream().map(n -> n * 2)`              |
| `flatMap(Function)`  | Flatten nested streams                 | `listOfLists.stream().flatMap(List::stream)` |
| `distinct()`         | Remove duplicates                      | `nums.stream().distinct()`                   |
| `sorted()`           | Sort elements in natural order         | `nums.stream().sorted()`                     |
| `sorted(Comparator)` | Sort elements using a comparator       | `nums.stream().sorted((a,b) -> b - a)`       |
| `limit(long n)`      | Take first `n` elements                | `nums.stream().limit(3)`                     |
| `skip(long n)`       | Skip first `n` elements                | `nums.stream().skip(2)`                      |
| `peek(Consumer)`     | Perform action (usually for debugging) | `nums.stream().peek(System.out::println)`    |

Ways of creating stream : 
1. From Collection
List<Integer> list = Arrays.asList(1, 2, 3);
Stream<Integer> s = list.stream();

2. Parallel Stream
Stream<Integer> ps = list.parallelStream();

3. From Array
int[] arr = {1, 2, 3};
IntStream s = Arrays.stream(arr);

4. Using Stream.of()
Stream<String> s = Stream.of("A", "B", "C");

5. Empty Stream
Stream<Integer> s = Stream.empty();

6. Infinite Stream (generate)
Stream<Double> s = Stream.generate(Math::random);

7. Infinite Stream (iterate)
Stream<Integer> s = Stream.iterate(1, n -> n + 1);

| Terminal Operation | Result           | Terminal operations return a result(value) not a stream
| ------------------ | ---------------- |
| `forEach()`        | side-effect      |
| `collect()`        | List / Set / Map |
| `count()`          | long             |
| `reduce()`         | single value     |
| `min()` / `max()`  | Optional         |
| `findFirst()`      | Optional         |
| `anyMatch()`       | boolean          |
 */