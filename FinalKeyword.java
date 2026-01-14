final class Calc {
    public int add(int a,int b){
        return a+b;
    }
}

// class AdvCalc extends Calc {  ERROR : cannot inherit from final Calc
// }

class A {
    public final void show(){ 
        System.out.println("By A");
    }
    public int sum(int a,int b){
        return a+b;
    }
}

class B extends A {
    // public void show() {  ERROR : show() in B cannot override show() in A overridden method is final
    //     System.out.println("By B");
    // }
    public int sub(int a,int b){
        return a-b;
    }    
}

public class FinalKeyword {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before : " + num);
        num = 7;
        System.out.println("After : " + num);

        // Final Keyword :
        final int n = 8;
        // n = 9; Error : cannot assign a value to final variable n (i.e cannot modify)
        System.out.println(n);

        A obj = new B();
    }
}
/*Note :
final + variable → constant (value cannot be changed / modified)
final + method → no overriding (no subclass can override the final method i.e the final method cannot be override in child classes)
final + class → no inheritance (no class can extend final class)
final methods → no Dynamic Method Dispatch
final improves security & performance
 */