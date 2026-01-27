// throws is used in a method declaration to tell the compiler that the method may pass an exception to the caller instead of handling it.
class A
{
	public void show() throws ClassNotFoundException {
   	// try
   	// {
   	// 	Class.forName("Calc");
   	// }
   	// catch(ClassNotFoundException e)
   	// {
   	// 	System.out.println("Not able to find theh class");
   	// }
	
		Class.forName("LearnJavaIsFun"); 
	}
}

public class ThrowsKeyword {
	
	static {
		System.out.println("Class Loader");
	}
	
    public static void main(String[] args) {
    	A obj=new A();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
            System.out.println("Unable to find the class " + e.getMessage());
    		e.printStackTrace();
    	}
    }
}
/*
Note : the above code will execute the ClassNotFoundException only if the class eneter in Class.forName("LearnJavaIsFun"); is not in the folder else it ignores the try catch block as no exception is thrown by throws keyword 
Key points :
1. Used in method signature
2. Can declare multiple exceptions as : throws IOException, SQLException
3. Does not handle the exception
4. Checked exceptions must be handled or declared
5. Unchecked exceptions don’t need throws

Example : Multiple parent methods can declare exceptions using throws, which are propagated and finally handled in the main() method.
import java.io.*;

class Parent1 {
    void fileRead() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt"); // may throw FileNotFoundException
    }
}

class Parent2 {
    void classLoad() throws ClassNotFoundException {
        Class.forName("Calc"); // may throw ClassNotFoundException
    }
}

class Child extends Parent1 {
    Parent2 p = new Parent2();

    void process() throws FileNotFoundException, ClassNotFoundException {
        fileRead();      // exception passed up
        p.classLoad();   // exception passed up
    }
}

public class TestThrows {
    public static void main(String[] args) {
        Child c = new Child();

        try {
            c.process();   // all exceptions handled here
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}

*/