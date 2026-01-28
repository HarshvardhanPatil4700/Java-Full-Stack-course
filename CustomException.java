// A custom exception is an exception created by extending Exception or RuntimeException to represent errors specific to an application.

import java.util.Scanner;

// class MyException 
class MyException extends Exception {
	public MyException(String string)
	{
		super(string);
	}
}

class Result extends Exception {
    public Result(String s) {
        super(s);
    }
}

class Pass extends Exception {
    public Pass(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
//    	int i=2;
//   	int i=0;
    	int i=20;
    	int j=0;
 
    	try
    	{
    		j=18/i;
    		if(j==0)
//    			throw new Exception("I don't want to do print zero");
    			throw new MyException("I don't want to do print zero");
    	}

    	catch(MyException e)
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);
//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Total : ");
        int total = s.nextInt();
        try {
            if(total < 35){
                throw new Result("Fail");
            } else {
                throw new Pass("Pass");
            }
        } 
        // catch (Result e) {
        //     System.out.println("Result : " + e.getMessage());
        // } 
        // catch (Pass e) {
        //     System.out.println("Result : " + e.getMessage());
        // }
        catch (Result | Pass e) { // Multi-cast exception
            System.out.println("Result : " + e.getMessage());
        }
    }
}
