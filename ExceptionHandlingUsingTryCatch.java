// Exception handling is used to handle run-time errors so the program doesn’t crash.
/*
try {
    // code that may cause exception
} catch (ExceptionType e) {
    // handling code
}
*/

public class ExceptionHandlingUsingTryCatch {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 0;
        // int c = 100/a;
        // System.out.println(c); // gives output
        // int d = 10/b;
        // System.out.println(d); // produces exception and execution stops here, So the exception must be handled 
        // System.out.println("Good day!");

        // int i = 2;
        int i = 0;
        int j = 0;

        try {
            j = 20/i;
        } catch (Exception e) { // Exception is class and 'e' is instance of that class
            System.out.println("Cannot divide by zero");
            System.out.println(e); // gives the name of exception
        }
        System.out.println(j);

        try {
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[7]);
        } catch (Exception e) {
            System.out.println("Array Index out of bound");
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Some exception occurred");
        }
        System.out.println("Done!");


    }
}
/*
try block checks if there is any exception or not and if present, then throws the exception which is caught by 'catch' block and it is executed
If no exception is present then, the try block dont throw any exception and catch block is ignored

Key Points :
1. try must be followed by at least one catch or finally
2. Multiple catch blocks allowed
3. Prevents abnormal program termination
 */