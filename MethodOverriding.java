// Method Overriding - when a child class provides its own implementation of a method that is already defined in the parent class.

class A {
    void show() {
        System.out.println("Parent show");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("Child show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // A obj = new A();
        // B obj = new B(); Method Overloading
        A obj = new B();
        obj.show();
    }
}
// Rules of Method Overriding
// (IMP) 0. static methods (method hiding),final methods,private methods,Constructors cannot be overriden
// 1.Same method name
// 2.Same parameter list
// 3.Inheritance must exist
// 4.Return type must be same or covariant
// 5.Access level cannot be more restrictive
// 6.Happens at runtime