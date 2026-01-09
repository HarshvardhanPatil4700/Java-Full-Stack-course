// The do-while loop is used when you want the loop to run at least once, even if the condition is false.
// format - 
// do {
//     // code to execute
// } while (condition);

import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        int i =5;
        do { 
            System.out.println("Hi " + i);
            i++;
        } while (i<=4);

        int j = 7;
        do { 
            System.out.println("Hi " + j);
            j++;
        } while (j<=10);

        // Common Use Case (Menu Program)
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
        } while (choice != 2);
    }
}
