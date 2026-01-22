// An inner class is a class defined inside another class. It is mainly used to logically group classes and to increase encapsulation. Whenever we compile the code, a .class file is created as : outerfile$Innerfile
// Access private members of outer class
// Better readability & organization
// Used in event handling, collections, multithreading

class Outer {
    int age;
    public void show() {
        System.out.println("in outer class");
    }

    class Inner {
        int x = 5;
        public void display() {
            System.out.println("In inner class");
        }
    }
}

// What if the inner class is Static class : Note- only inner class can be static, outer class cannot
class A {
    public void show1() {
        System.out.println("in show1");
    }

    static class B { // we cannot create the objects of static class
        public void config() {
            System.out.println("In config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
        // o.display(); The method display() is undefined for the type Outer

        // Inner i = new Inner(); Inner cannot be resolved to a type .Instead its object is created as : OuterClass.InnerClass = outerClassObject.new InnerClass();
        Outer.Inner i = o.new Inner();
        System.out.println(i.x);
        i.display();
        // i.show(); inner class cannot access the methods and vars of outer class and outer class cannot access inner class ones.

        A a = new A();
        a.show1();
        A.B b = new A.B(); // by this way, we can create the object of static inner class
        b.config();
    }
}
