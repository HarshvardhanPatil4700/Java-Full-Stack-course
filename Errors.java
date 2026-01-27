/*
Types of error :
1. Compile-time Errors: Found before execution, during compilation, Caused by syntax mistakes(Missing ; ,Wrong spelling of keywords, Type mismatch). These are Detected by compiler
2. Run-time Errors : Occur while program is running, Program compiles successfully but crashes during execution (Divide by zero, Array index out of bounds, Null pointer access). Causes abnormal termination
3. Logical Errors : Program runs without crashing, Output is incorrect (Wrong formula,Incorrect condition in if / loop). Hardest to detect as errors are due to programmer's logic and not produce any errors
 */

public class Errors {
    public static void main(String[] args) {
        // 1.
        // System.out.Println();
        // String s = "abc"  Missing ;
        // int a = "10"; Type mismatch

        // 2.
        // int x = 10 / 0;  Runtime error (Exception in thread "main" java.lang.ArithmeticException: / by zero)
        // int rollNo[] = new int[5];
        // System.out.println(rollNo[6]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5

        // 3.
        int a = 5, b = 10;
        System.out.println(a - b); // logic error (wanted sum)
        for(int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        } // logical error (wanted 1 to 5 (ascending))
    }
}