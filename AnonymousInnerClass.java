class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousInnerClass { // when compiled it creates a .class file as : className$NumberOfClass
    public static void main(String[] args) {
        A a = new A()
        {
            public void show() {
                System.out.println("In updated A show");
            }
        };
        a.show();
    }
}
/* An Anonymous Inner Class is an inner class without a name, used for one-time implementation of a class or interface.

Key Features :
No class name
Created at the time of object creation
Used for one-time use
Cannot have a constructor
Can extend one class or implement one interface */
