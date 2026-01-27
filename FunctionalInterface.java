// Functional (SAM - Single Abstract Method) Interface is a type of interface which contains only one method

// @FunctionalInterface : In java8, the @FunctionalInterface is not supported(Deprecated) and lambda expressions are used
interface A {
    void show();
}

// class B implements A{
//     @Override
//     public void show() {
//         System.out.println("in B show");
//     }
// }

public class FunctionalInterface {
    public static void main(String[] args) {
        A a = new A(){   // Anonymous inner class
            @Override
            public void show() {
                System.out.println("In show");
            }
        }; 
        a.show();
    }
}
