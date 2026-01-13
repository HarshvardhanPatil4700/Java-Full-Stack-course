import java.util.Scanner;
import other.tools.AdvCalc;
import other.tools.Calc;

public class Packages {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(3,4));
        AdvCalc a = new AdvCalc();
        System.out.println(a.multiply(5, 2));
        Scanner s = new Scanner(System.in);
        System.out.print("Enter you name : ");
        String name = s.next();
        System.out.println("Name : " + name);
        System.out.println(); // System is also a class which lies in java.lang.System ,But we need to not import in every file as it present by default in every java file
    }
}

/*
Note : In Java, some packages and classes are already available by default when you create a Java file. These are part of the Java Standard Library.
1. java.lang : contains 
Object – the superclass of all classes.
String – for text.
Math – for math functions.
System – for I/O, environment.
Integer, Double, Boolean, Character – wrapper classes.
Thread, Throwable, Exception, Error.
(You don’t need to write import java.lang.*; — it’s done automatically.)

Meanwhile,for other packages :
Other Common Built-in Packages (These are NOT automatically imported, you need to use import for them.)

java.util – collections, date, random, scanner
java.io – file handling, input/output streams
java.net – networking classes
java.sql – database connectivity
java.time – date and time API

 */