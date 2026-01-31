// ArrayList is a resizable array implementation of the List interface in Java.
// It stores elements in insertion order and allows duplicates.
import java.util.ArrayList;
import java.util.List;
public class ArraylistInJava {
    public static void main(String[] args) {
        // Collection<Integer> num = new ArrayList<Integer>(); // initializes the ArrayList with empty value
        ArrayList<String> names = new ArrayList<>();
        List<Integer> num = new ArrayList<>(); // initializes the ArrayList with empty value
        System.out.println(num);
        num.add(3);
        num.add(5);
        num.add(8);
        num.add(0);
        // num.add('a'); ERROR : cannot add other data types values
        System.out.println(num); // we dont need any loop to print the collection/list (unlike array)
        // using loop :
        for(int n : num) {
            System.out.println(n);
        }

        // Methods - 
        // fetching data from list using indexes:
        System.out.println("at index 2 : " + num.get(2));
        // System.out.println("at index 10 : " + num.get(10)); java.lang.IndexOutOfBoundsException
        System.out.println(num.indexOf(8));
        System.out.println(num.add(10)); // adds at the end
        System.out.println("after adding 10 : " + num);
        num.remove(3);// removes the 3rd index
        System.out.println("after removing 3rd index :" + num);

        // Collection nums = new ArrayList(); 
        // System.out.println(nums);
        // nums.add(6);
        // nums.add(5);
        // nums.add(3);
        // nums.add(8); 
        // System.out.println(nums); // note here we are adding the object to collection and not values
        // for(Object o : nums) {
        //     int x = (Integer) o;
        //     System.out.print(x*2 + " ");
        // } // we can do so But if there is an Object of other adta types then it gives exception

        // nums.add('s');
        // nums.add(false);
        // for(Object o : nums) {
        //     int x = (Integer) o;
        //     System.out.print(x*2 + " ");
        // } // gives exception        
    }
}
// use 'Collection' to store and fetch the value and if you want to work with index then use 'List' (as List support index while Collection does not)
/*Key points:
 Dynamic size (grows automatically)
 Maintains order
 Allows duplicate elements
 Not synchronized (not thread-safe by default)
 Slower insert/delete in the middle (shifting needed) 
 
 Methods: get(index), add(value), remove(index)
 */