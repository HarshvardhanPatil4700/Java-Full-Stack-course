import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;

        do { 
            System.out.println("\n***** Calculator *****");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter your choice : ");

            ch = s.nextInt();

            if(ch >=1 && ch <= 4){
                System.out.print("Enter first number : ");
                double a = s.nextDouble();

                System.out.print("Enter second number : ");
                double b = s.nextDouble();

                // switch(ch) {
                //     case 1 :
                //         System.out.println("Addition of " + a + " and " + b + " = " + (a+b));
                //         break;
                //     case 2 :
                //         System.out.println("Subtraction of " + a + " and " + b + " = " + (a-b));
                //         break;
                //     case 3 :
                //         System.out.println("Multiplication of " + a + " and " + b + " = " + (a*b));
                //         break;
                //     case 4 :
                //         if(b != 0)
                //             System.out.println("Division of " + a + " and " + b + " = " + (a/b));
                //         else
                //             System.out.println("Cannot divide by zero");
                //         break;
                // }
                switch(ch) {
                    case 1 -> System.out.println("Addition of " + a + " and " + b + " = " + (a+b));
                    case 2 -> System.out.println("Subtraction of " + a + " and " + b + " = " + (a-b));
                    case 3 -> System.out.println("Multiplication of " + a + " and " + b + " = " + (a*b));
                    case 4 -> {
                        if(b != 0)
                            System.out.println("Division of " + a + " and " + b + " = " + (a/b));
                        else
                            System.out.println("Cannot divide by zero");
                    }
                }
            }else if(ch != 5) {   // if ch is anything other than 1 to 5 print "Invalid choice"
                System.out.println("Invalid choice");
            }            
        } while (ch != 5); // run the loop until ch is not equal to 5 i.e run loop until ch = exit
        
        System.out.println("Thank you for using the Calculator. Goodbye!");
        s.close();
    }
}