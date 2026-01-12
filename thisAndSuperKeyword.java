// this() : this() can be used in a child class, but it still calls only child class constructors
// super() : Refers to the parent (super) class object.It is present in every method at first line even if we dont mention it.A constructor cannot have more than one super() call.Note :this() and super() cannot be present in same constructor

class A extends Object{ // class A extends Object (Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.Every class extends/inherits the Object class even if we dont mention)
    public A() {
        super();
        System.out.println("In A");
    }
    public A(int n) {
        super();
        System.out.println("In A int");
    }
}
class B extends A {
    public B() {
        super(); // Call parent (superclass) class constructor.NOTE : It calls the default constructor and not the parameterized.
        // super(n); // Calls the parameterized parent class constructor.
        System.out.println("In B");
    }
    public B(int n) {
        super(n); // Calls the parameterized parent class constructor.
        System.out.println("In B int");
    }
    public B(String s) {
        this(); // Calls the parameterized parent class constructor.
        System.out.println("In B int");
    }
}

public class thisAndSuperKeyword {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println();
        B obj1 = new B(5);
        System.out.println();
        B obj2 = new B("abc"); // it calls the constructor of same class i.e B() calls the the parent class constructor i.e A() due to super();
    }
}
