
public class CE5 {
    public static void main(String[] args) {
       
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 
 
        while (again.equalsIgnoreCase("y")) {
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid operator.");
            }
 
            again = "n";
        }
 
        System.out.println("Thank you for using the calculator.");
    }
}