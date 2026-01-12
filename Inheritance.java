class Calc { // Superclass
    private int x;
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
}

// Advclass = subclass. The 'extends' keyword denotes the inheritance(AdvCalc is a Calc).This is single level Inheritance
class AdvCalc extends Calc { // the AdvCalc inheits the methods of class Calc  via inheritance and now can access them 
    public int multiply(int a,int b) {
        return a*b;
    } 
    public int divide(int a,int b) {
        return a/b;
    }
    // public void show(){
    //     System.out.println(x);  x has private access in Calc and it cannot be accessed in the child classes
    // }
}

public class Inheritance {
    public static void main(String[] args) {
        // Calc c = new Calc();
        // int r1 = c.add(6,4);
        // int r2 = c.sub(8,4);
        // System.out.println(r1 + " " + r2);
        
        AdvCalc ac = new AdvCalc();
        int r1 = ac.add(3 ,7);
        int r2 = ac.sub(8 ,4);
        int r3 = ac.multiply(2 ,4);
        int r4 = ac.divide(8 ,4);
        System.out.println("Addition = " + r1);
        System.out.println("Subtraction = " + r2);
        System.out.println("Multipliaction = " + r3);
        System.out.println("Division = " + r4);
    }
}
