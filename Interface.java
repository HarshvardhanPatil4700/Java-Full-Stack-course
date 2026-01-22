// abstract class A {
//     public abstract void show();
//     public abstract void config();
// } Rather we can create an interface

// An interface in Java is a fully abstract blueprint of a class that defines what a class must do, not how.Object of interface cannot be created. Implemented using implements. Variables are public, static, final. interface are not in memory heap
interface A {
    // int x; the variable in interface are public, static, final so must be initialized
    int x = 10;  // public, static, final
    String name = "ABC"; // public, static, final
    void show(); // the methods and variables in interface are 'public' and 'abstract' by default
    void config();
} 

class B implements A { // as class B implements the interface it by default becomes abstract class and must implement the methods of interface else gives error

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class Interface {
    public static void main(String[] args) {
        // A obj = new A(); // A is interface(abstract); cannot be instantiated (Object of interface cannot be created)
        A obj; // However, reference can be created
        B ob = new B();
        ob.show();
        ob.config();

        System.out.println(A.x); // the var is static it can be accessed without object creation
        // A.x = 15; cannot assign a value to static final variable x
        System.out.println(B.name);
    }
}
