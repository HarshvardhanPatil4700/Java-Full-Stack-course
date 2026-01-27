// An annotation is a special kind of metadata you add to code to give extra information to the compiler, JVM, or frameworks — without changing the program’s logic. Think of it as a label or note for the system, not for the user. They provide information about code that can be used at compile-time or runtime. They start with @
@Deprecated
class A {
    public void showTheDatWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}
class B extends A {
    @Override
    public void showTheDatWhichBelongsToThisClass() { // if the method name varies like 'showTheDatWhichBelongClass' then the override annotation gives error
        System.out.println("in B show");
    }
}
public class Annotation {
    public static void main(String[] args) {
        // A a = new A(); uncomment this line to view effect of Deprecated annotation
        // a.show();
        // A obj = new B();
        // obj.show();
        B obj = new B();
        obj.showTheDatWhichBelongsToThisClass();
    }
}
/* Annotations:
@Deprecated - Marks old code
@SuppressWarnings - Hides compiler warnings
@FunctionalInterface - Ensures only one abstract method 
*/
