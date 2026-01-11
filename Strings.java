import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String(); // Creates a new String object in Heap with value as Empty String.
        String c = new String("World"); // Here, the value "World" is passed as argument to constructor of String class.
        String d = new String("World"); 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // hashcode
        System.out.println(a.hashCode()); // hashCode() is a method of String class that returns an integer value representing the String’s content.String.hashCode() returns the same integer value for Strings having the same characters in the same order.Example-
        System.out.println(c.hashCode());
        System.out.println(d.hashCode()); // c and d String hashcode matches as the values of string matches

        // String Concatenation (+ , concat() operator)
        String greet = a + " " + c;
        System.out.println(greet);
        String greeting = a.concat(" World");
        System.out.println(greeting);

        // charAt(index) operator :
        String s = "Hello World";
        System.out.println(s.charAt(3));
        // example : to take user input for yes or no as "Y" or "N"
        Scanner u = new Scanner(System.in);
        System.out.print("Enter your answer (yes/no) : ");
        String userInput = u.next();
        if(userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y') {
            System.out.println("Yes, User agrees");
        }else {
            System.out.println("user disagrees");
        }
    }
}
