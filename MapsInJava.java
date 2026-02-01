// Map in Java is a Collection Framework that stores data as key–value pairs. Keys are unique and Values can be duplicate i.e Keys are Set and Values are List
// It is part of java.util, NOTE: but not a sub-interface of Collection

import java.util.HashMap;
import java.util.Map;

public class MapsInJava {
    public static void main(String[] args) {
        // Collection<Integer,String> names = new HashMap<>(); // we cannot do this because Map is not sub interface of Collection interface
        Map<Integer,String> students = new HashMap<>();
        System.out.println(students);
        // 1. put(key,value) - inserts the key value pair in Map
        students.put(12, "Jessie");
        students.put(23, "Bob");
        students.put(34, "John");
        students.put(47, "Williams");
        students.put(52, "Hughie");
        // students.put("Alex", 30); data type must match to Map declaration else gives error
        students.put(52, "Adam");// Keys are unique(cannot be duplicate), So it takes value which is allocated to key at latest (think of it as : "Hughie" overwrites "williams" when same key allocated)
        students.put(91, "Bob"); // Values can be duplicate
        System.out.println(students);

        // get(key) - gives the value of repective key from the Map
        System.out.println(students.get(23));

        // keySet() - returns all the Keys of Map
        System.out.println(students.keySet());
        // values() - returns all the values of Map
        System.out.println(students.values());
        // we can also print the Map using loop, keySet() and get(key) as :
        for(int rollNo : students.keySet())
            System.out.println(rollNo + " : " + students.get(rollNo));

        // remove(key) - removes specified key-value pair from Map
        students.remove(47);
        System.out.print("after removing 47 : " + students);
        // replace(key,value) - Replaces the entry for the specified key only if it is currently mapped to some value (optional operation).
        students.replace(12, "Nolan");
        System.out.print("\nUpdated : " + students);
    }
}
/*
add - adds new element
put - checks if element is present if yes, replace its value , Else add the element 

Key points :
1. Map (Interface) - 
Stores key–value pairs
Keys must be unique, values can repeat
Not a sub-interface of Collection
Located in java.util
Allows one null key (depends on implementation)

2. HashMap - Most commonly used
Implements Map
No ordering (random order)
Allows 1 null key + multiple null values
Not thread-safe
Fast: O(1) average for put/get
Uses Hashing

3. Hashtable - 
Legacy class
Synchronized (thread-safe)
No null key, no null value
Slower than HashMap
Rarely used now
Used in old multithreaded code

4. LinkedHashMap - 
Extends HashMap
Maintains insertion order
Allows 1 null key
Slightly slower than HashMap
Uses Hash table + doubly linked list
Used when order matters*/