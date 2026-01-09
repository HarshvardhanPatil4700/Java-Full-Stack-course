// The switch statement is used to execute one block of code out of many, based on the value of a variable or expression.simple replacement for longer versions of if-elseIf-else statements
// Note : fall-through occurs in a switch statement if there is no "break" keyword in the blocks of cases(break in deafult case is optional)
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // example 1 : weekdays using switch cases
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number.");
        }

        // example 2 :menu driven program 
        int a = 10;
        int b = 5;
        System.out.println("Choose one of the given options - \na : Addition.\nb : Subtraction.\nc : Multiplication.\nd : Division.");
        char options = s.next().charAt(0); // only take first character if string is entered as options
        switch(options){
            case 'a' :
                System.out.println("Addition of " + a + " and " + b + " is : " + (a+b)); // not => System.out.println("Addition of " + a + " and " + b + " is : " + a+b); else o/p is 105 (concatenates a and b)
                break;
            case 'b' :
                System.out.println("Subtraction of " + a + " and " + b + " is : " + (a-b));
                break;
            case 'c' :
                System.out.println("Multiplication of " + a + " and " + b + " is : " + (a*b));
                break;
            case 'd' :
                System.out.println("Division of " + a + " and " + b + " is : " + (a/b));
                break;
            default:
                System.out.println("Enter a valid Option");
        }
    }
}
