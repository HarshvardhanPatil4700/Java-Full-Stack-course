// The static keyword is used to define class-level members that are shared among all objects and can be accessed without creating an instance.A static variable is a variable declared using the static keyword.
// It belongs to the class, not to individual objects.
/*Only one copy exists in memory
Shared among all objects
Stored in method area / metaspace
Accessed using class name
Initialized once when class is loaded */

//Static Method :A static method is a method declared using the static keyword.It belongs to the class, not to objects, and can be called without creating an instance(object).So,the main function is static so that pgm can be run without creating any object
// 1. Class-level method
// 2. Called using class name
// 3. Only one copy exists
// 4. Cannot use this or super
// 5. Cannot directly access non-static members

class Mobile{
    String brand;
    int price;
    static String name; // makes the name var a class member and shares a single common copy among all the objects

    public void show() {
        System.out.println(brand + " " + name +  " : " + price);
    }

    public static void show1() {  
        // System.out.println(brand + " " + name +  " : " + price); ERROR:non-static variable brand cannot be referenced from a static context.Although, the name variable can be used as it is static
        System.out.println("In static method");
    }
    public static void show2(Mobile obj) {  
        // System.out.println(brand + " " + name +  " : " + price); ERROR:non-static variable brand cannot be referenced from a static context.Although, the name variable can be used as it is static
        System.out.println("In static method");
        System.out.println(obj.brand + " " + name +  " : " + obj.price);
    }
}

public class StaticVariablesAndMethods {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        // m1.name = "Smartphone"; Gives Warning : The static field Mobile.name should be accessed in a static way (i.e must be accessed using class name)
        Mobile.name = "Smartphone";
        
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1400;
        // m2.name = "Smartphone"; Gives Warning
        Mobile.name = "Smartphone";

        m1.show();
        m2.show();

        m1.name = "DigitalPhone"; // even if one object changes the static var it changes for all as it is a common var shared among all objects
        System.out.println();
        m1.show();
        m2.show();

        // Mobile.show(); non-static method show() cannot be referenced from a static context
        Mobile.show1();
        // we can pass object to static method and then use non static variables in static method
        Mobile.show2(m1);
    }
}
/* If main() is non-static, the program will not run because :
JVM calls main() without creating an object
A non-static method requires an object
So JVM cannot access it */