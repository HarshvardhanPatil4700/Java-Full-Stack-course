
import java.util.Scanner;

// The ternary operator (? : ) is a short form of if-else used for simple conditions.
// Format- returnType varName = (condition) ? True Statement : False Statement 
public class TernaryOperator {
    public static void main(String[] args) {
        // Example 1 :
        int n = 4;
        // if (n % 2 == 0) {
        //     System.out.println("even no.");
        // } else {
        //     System.out.println("odd no.");
        // }
        String evenOddCheck = (n%2 == 0) ? "Even" : "Odd";
        System.out.println(evenOddCheck);

        // Example 2 :
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = s.nextInt();
        String result = (x>0) ? "Positive" :
                        (x<0) ? "Negative" : 
                                "Zero";
        System.out.println(x + " is a " + result + " number");

        // Example 3 :
        int age = 18;
        boolean isEligible = (age >= 18) ? true : false;
        System.out.println(isEligible);
    }
}
