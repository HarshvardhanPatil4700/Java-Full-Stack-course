// A Set is a collection framework that does not allow duplicate elements (supports unique values only).It does not supports indexing(cannot use indexes)
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
// import java.util.LinkedHashSet;

public class SetsInJava {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(); // or use -> Set<Integer> nums = new HashSet<Integer>();
        System.out.println(nums);
        nums.add(7);
        nums.add(2);
        nums.add(1);
        nums.add(9);
        nums.add(2); // duplicates are ignored and printed only one time
        // nums.add(null); // at most one null is allowed
        System.out.println(nums);
        nums.remove(9);
        System.out.println("updated nums : " + nums);
        // using loop :
        for(int n : nums) {
            System.out.println(n);
        }
        // we can also declare sets as : Collection<datatype> objName = new typeOfSet<>();
        // Collection<Integer> name = new LinkedHashSet<>();

        // TreeSet : performs sorting 
        Set<Integer> num = new TreeSet<>();
        num.add(79);
        num.add(29);
        num.add(12);
        num.add(91);
        num.add(5);
        System.out.println(num);
        
        // Iterator : Iterator is an interface used to traverse (iterate) elements of a collection one by one, especially when the collection does not support indexing (like Set).
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) { // hasNext returns true if there is a next element present else returns false
            System.out.println(it.next()); // prints the next element
        }

        // IMP : List to Set
        List<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Alex");
        names.add("Roger");
        names.add("Mike");
        names.add("Mike");
        System.out.println(names);
        Set<String> names1 = new HashSet<>(names); // we can pass another object (as done). it copies values of the object in current object.Here, The Set removes the duplicates present in List (so, This method can be used to remove duplicates)
        System.out.println(names1);

    }
}
/*
1. Set (Interface) - 
No duplicate elements allowed
At most one null (depends on implementation)
No index-based access
Order not guaranteed
Part of Collection framework

2. HashSet - 
Implements Set
No ordering guarantee
Allows one null
Uses hashing (hashCode + equals)
Average O(1) time for add/remove/search
Fastest Set implementation
Output may look sorted for small values → coincidence

3. LinkedHashSet - 
Extends HashSet
Maintains insertion order
Allows one null
Slightly slower than HashSet
Uses hash table + doubly linked list
Predictable iteration order

4.TreeSet -
Implements NavigableSet
Stores elements in sorted order
Uses Red-Black Tree
No null allowed
Time complexity O(log n)
Sorting based on:Natural ordering (Comparable),Custom ordering (Comparator)
Best when sorted data is required 
*/