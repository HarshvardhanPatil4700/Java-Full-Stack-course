package other;


public class A {
    // public int marks = 5;
    // private int marks = 5;
    // int marks = 5; Default
    protected int marks = 5; 
    public void show() {
        System.out.println("A");
    }
}

class Launch {
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks); // the 'marks' is protected variable, so accessible in same package (Launch and A is in same package) Also it is accessible in subclass present outside package (like in class C), but it is not accessible in other package classes which is not subclass of class where marks is defined (like in class AccessModifiers file which is in other package and not a subclass)
    }
}
/*  Note: 
1. Try to makes the class public. There can be only 1 public class in a file
2. Try to keep Instance variables private (if needed) and methods as public
3. If you want any variable or method to be accessed only in subclass then make it protected
*/ 