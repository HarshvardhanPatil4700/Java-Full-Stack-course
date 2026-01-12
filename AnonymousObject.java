// An anonymous object is an object created without storing it in a reference variable. It is used only once at the time of creation.Synatx : new ClassName().methodName();

class A {
    public A() {
        System.out.println("Object created");
    }
    public void show() {
        System.out.println("In A show");
    }
}

class B {
    public B() {
        System.out.println("Object craeted");
    }
    public void show() {
        System.out.println("In B show");
    }
}

class voting{
    public void myVote(String partyName) {
        System.out.println("You Voted " + partyName);
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        // int marks = 90;
        // int marks;
        // marks = 90;

        A obj;  // reference creation where "obj" is reference
        obj = new A(); // the 'new' creates the new object(this part is actual OBJECT CREATION)
        obj.show();

        new B(); // such a object is called as Anonymous object as it does not have any reference.While objects like A is called as referenced object
        new B().show(); // Anonymous object

        new voting().myVote("ABC");
    }
}
// KEY POINTS:
// No reference variable
// Used for one-time use
// Saves memory (no extra reference)
// Cannot reuse the object as Anonymous object is stored in Heap only, not in Stack.