public class MutableAndImmutableStrings {
    public static void main(String[] args) {
        String name = "John";
        name += " Wick"; // name = name + " Wick" . Here, we are not changing the string, we are reassigning the reference variable to a newly created String object.(i.e if "john" points to 101 then "john wick" points to 107 then we just change reference of string name to 107.)
        System.out.println(name);

        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "ABC";

        System.out.println(s2 == s3); // as s2 and s3 strings are same they refer to same string value i.e "ABC" in String constant pool (SCP) in the heap.

        // STRING BUFFER AND BUILDER : Both StringBuffer and StringBuilder are used to create mutable (changeable) strings.
        // 1. StringBuffer is a mutable, thread-safe class used to modify strings.(slower than string builder)
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("William");
        System.out.println(sb.capacity()); // 16 bytes
        System.out.println(sb1.capacity()); // capacity = initial_String + 16 bytes
        System.out.println(sb.length()); // length is same as the string length
        System.out.println(sb1.length());
        // there are various methods for stringBuffer as :- sb.methodName();
        sb1.append(" Arthur");
        System.out.println(sb1);
        sb1.deleteCharAt(2);
        System.out.println(sb1);
        sb1.insert(2, "l");
        System.out.println(sb1);
        sb.setLength(25);
        // Diff between StringBuffer and StringBuilder is : StringBuffer is thread-safe while StringBuilder is not thread-safe
    }
}
// NOTE : we can apply the methods on string directly but it creates a new object every time (immutable). Hence, 1000+ new String objects created,High memory usage and Slow performance.So, we use StringBuffer which mutates the same string object without creating multiplt string objects (mutable).