class A { // A doe s not know B
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A { // B knows A
    public void show2(){
        System.out.println("in B show");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        int a1 = 5;
        double d1 = a1; // Safe, No cast needed (done implicitly (automatically))
        double d = 4.5;
        int n = (int) d; // Not safe,cast needed (must be specified explicitly)
        System.out.println(d + " " + n);

        // Upcasting :
        A a = new B();
        a.show1();
        
        // Downcasting : Downcasting is valid only if a is actually pointing to a B object, else it gives ClassCastException. Downcasting checks happen at runtime, not compile time.
        B b = (B) a;
        b.show2();
        b.show1();
    }
}
/* Typecasting : converting one data type into another.
1. Primitive Typecasting :
a) widening : int to double , float to double, etc (converting data type to another dt which is larger than it)
b) narrowing : double to int, int to short, etc (converting data type to another dt which is smaller than it)

2. Object (Reference) typecasting :
a) upcasting: converts a subclass object to a superclass reference (Child to Parent), which is implicit and safe, allowing access to parent methods for polymorphism.
a) downcasting: converts a superclass reference back to a subclass type (Parent to Child), requiring explicit casting and instanceof checks to avoid ClassCastException, enabling access to specific child methods.

A a = new B();     // upcasting
B b = (B) a;      // downcasting 
a → reference of type A
(B) a → explicitly telling JVM: “Trust me, this object is actually a B”
b → now a child reference
*/