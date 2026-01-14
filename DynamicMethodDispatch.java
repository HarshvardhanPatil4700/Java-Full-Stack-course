class A{ 
    public void show() {
        System.out.println("In A show");
    }
    public void m1() {
        System.out.println("m1 A");
    }
}
class B extends A {
    public void show(){
        System.out.println("In B show"); 
    }
    public void m2() {
        System.out.println("m2 B");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}

class D {
    public void show(){
        System.out.println("In D show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A(); // the obj object in stack points to 'A' object in heap
        obj.show(); // in A show
        obj.m1();
        // obj.m2(); not accessible(Because method access is checked at compile time using the reference type (A), and m2() is not declared in class A.)

        obj = new B(); // same as A obj = new B(); the obj object in stack points to 'B' object in heap
        obj.show(); // in B show
        obj.m1();
        // obj.m2(); The method m2() is undefined for the type A (not accessible for type 'A')

        obj = new C();
        obj.show();

        // obj = new D(); incompatible types: D cannot be converted to A (as D does not inherits A)
        // obj.show();
    }
}
/* A obj = new B(); Object's type is 'A' but implementation is of 'B'
A → Reference Type (Compile-time) -> Decides which methods are accessible and Only methods of class A are visible
new B() → Object Type (Runtime) -> Decides which method implementation is executed and JVM uses B’s overridden methods
*/