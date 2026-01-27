// The throw keyword is used to explicitly create and throw an exception manually in a program at runtime. i.e we delibrately throw the exception that we need to get caught and execute.
// Synatx : throw new ExceptionType("Error message");

public class ExceptionThrowKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 10 / i; 
            if(j==0){
                // throw new ArithmeticException(); 
                throw new ArithmeticException("the value of i > j"); 
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero " + e);
        } catch(Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println("Value of j = " + j);
        // as value of i is 20 and not 0 so the ArithematicException would be ignored and not be executed but as we create and throw new exception the ArithematicException is caught and executed

        // Example :
        int age = 15;
        
        try {
            if (age < 18) 
                throw new ArithmeticException("Not eligible to vote");
        } catch (Exception e) {
            System.out.println("Age is less than 18. " + e.getMessage()); // the .getMessage gets the message of the exception(Returns the detail message string of this throwable.)
        }
    }
}
/*
Used to customize exception messages
Can throw user-defined exceptions
Only one exception can be thrown at a time
Works for both checked & unchecked exceptions */