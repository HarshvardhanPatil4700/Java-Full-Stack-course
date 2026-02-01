import java.util.Arrays;
import java.util.List;

public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        System.out.println(nums);
        // Consumer object is a functional interface with accept(t) method and it is passed into forEach
        // Consumer<Integer> con = new Consumer<Integer>() { 
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };  // using lambda expression it can be written as :

        // Consumer<Integer> con = n -> System.out.println(n); // Instead of using 'con = n -> System.out.println(n);' we can also directly pass it in forEach as:
        // nums.forEach(con);
        nums.forEach(n -> System.out.println(n + 1));
        System.out.println("Updated List : " + nums);

        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream().forEach(System.out::print);

        System.out.println();
        // convert all the names of list into uppercase : 
        List<String> names = Arrays.asList("devin","mike","louis","dustin","will");
        names.forEach(n -> System.out.println(n.toUpperCase()));
    }
}
/*
break or continue cannot be used inside forEach() because it uses lambda expressions, not loop constructs. So, Avoid using forEach() when you need break, continue, early exit, or complex control flow logic.
 */