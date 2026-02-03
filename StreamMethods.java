
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Predicate<Integer> p = new Predicate<Integer>() { // filter(predicate) needs the predicate object which actually returns a boolean value specifying if the element satisfies the given condition or not
        //     @Override
        //     public boolean test(Integer n) {
        //         // if(n%2==0)
        //         //     return true;
        //         // else 
        //         //     return false;
        //     }
            
        // }; As predicate is a functional interface with test() method only, It can be wriiten as :
        Predicate<Integer> p = n -> n%2==0;

        // Function<Integer,Integer> func = new Function<Integer,Integer>() {
        //     @Override
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }
        // };
        Function<Integer,Integer> func = n -> n*2;

        int result = nums.stream()
                        //  .filter(n -> n%2 == 0)  
                         .filter(p)  
                        //  .map(n -> n*2)
                         .map(func)
                         .reduce(0, (a,b) -> a+b); 
        System.out.println(result);
    }
}
