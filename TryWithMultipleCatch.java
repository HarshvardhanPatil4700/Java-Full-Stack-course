/* 
try {
    // risky code
} catch (ExceptionType1 e) {
    // handle exception 1
} catch (ExceptionType2 e) {
    // handle exception 2
}
The try block throws an exception and the catch block with appropriate exception class is executed and rest are ignored */

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        String s = null;
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);   // executes the ArrayIndexOutOfBoundsException
            int a = 10 / 0;
            System.out.println(a);   // executes the ArithmeticException
            System.out.println(s.length());  // executes the Exception
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        catch(Exception e) { // Exception is Parent class i.e it contains all the exceptions as child
            System.out.println("Something went wrong " + e);
        }
    }
}

// Multiple catch blocks are allowed
// Only one catch executes
// (IMP) The Order must be child → parent (as above Arithematic and ArrayIndexOutOfBounds are above the Exception) bcoz if the parent class is kept above child class then it will be executed rather than child class exception
// finally always executes

// Java 7+ supports multi-catch (|)