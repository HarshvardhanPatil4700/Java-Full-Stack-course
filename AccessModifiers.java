// Access Modifiers : They control where a class, method, variable, or constructor can be accessed i.e control the visibility (scope). 
// 1. Public - Accessible from anywhere
// 2. Private - Accessible only within the same class
// 3. Default(No keyword used) - Accessible within the same package
// 4. Protected - Accessible in same package and Accessible in subclasses outside package

import other.A;

class C extends A {
    public void abc() {
        System.out.println(marks); // the marks var is protected which is
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.marks); Error:marks is not public in A; cannot be accessed from outside package.The field A.marks is not visible (untill we make the marks variable in A.java as public)
        // System.out.println(obj.marks); error : marks is private var which can be accessed only with the class it is defined in.
        // System.out.println(obj.marks); error : marks is default var which can only be accessed in same package
        // System.out.println(obj.marks); error : marks is protect
        obj.show();
        
        B obj1 = new B();
        System.out.println(obj1.marks);// B and AccessModifiers file is in same package
    }
}
