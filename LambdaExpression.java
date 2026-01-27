// Lambda expression are used to simplify the anonymous inner class.Also, lamba exp. works only for the functional interface as it has only single method

interface A {
    void show();
}
// class B implements A{
//     @Override
//     public void show() {
//         System.out.println("in B show");
//     }
// }

interface B {
    void config(int i);
}
public class LambdaExpression {
    public static void main(String[] args) {
        // A a = new A(){   // Anonymous inner class
        //     public void show() {
        //         System.out.println("In show");
        //     }
        // }; 
        // a.show();
        
        A obj = () -> System.out.println("In A show"); // if only sentence (dont use curly brackets). Java internally assigns this statement to the method of interface as it has only one method
        obj.show();

        // B ob = (int i) -> { 
        // B ob = (i) -> {  We can directly write the variable Name without mentioning its type as it has only one method
        B ob = i -> { // more polished way
            System.out.println("In B show");
            System.out.println("The value is " + i);
        };
        ob.config(5);
    }
}
