// The Stream API (Java 8+) is used to process collections of data in a functional style. It lets you filter, map, sort, and aggregate data without modifying the original collection. 
// Stream API is needed to process collections in a clean, functional, and efficient way with better readability, lazy evaluation, and parallel execution support.

import java.util.Arrays;
import java.util.List;

public class NeedOfStreamAPI {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        // nums.add(4);
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        // Printing the list: for loop, enhanced for loop, forEach method
        // for(int i=0;i<nums.size();i++){ // length() method is not supported by List
        //     System.out.println(nums.get(i));
        // }
        
        // for(int n : nums) {
        //     System.out.println(n);
        // }

        nums.forEach(n -> System.out.println(n)); 

        // System.out.println(nums);
        // int sum = 0;
        // for(int n : nums) {
        //     if(n % 2==0) { // works as filter
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);
    }
}