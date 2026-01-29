/*
Handling Arithmetic Exceptions in Java: Divide by Zero Safely
You are given two already-declared integer variables:
int numerator = 50;
int denominator = 0;
Write a Java program that divides the numerator by the denominator and handles any division by zero using a try-catch block.
If an exception occurs, print: Cannot divide by zero
Regardless of whether an exception occurs or not, print: Program completed */

public class CE9 {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;
        
        try {
            denominator = numerator / denominator;
        }
        catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Program completed");
        }
    }
}
