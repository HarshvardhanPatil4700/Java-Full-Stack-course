abstract class A {
    public abstract void show();
    public abstract void config();
}

public class AbstractAndAnonymousClass {
    public static void main(String[] args) {
        // A obj = new A(); cannot create object of abstract class
        A obj = new A(){ // here we created object of the anonymous inner class
            public void show() {
                System.out.println("in show");
            }       

            public void config() {
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
