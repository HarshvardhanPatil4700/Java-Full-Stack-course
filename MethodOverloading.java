// Method Overloading means having multiple methods with the same name in the same class, but with different parameters.
// Methods must differ by:
// 1. Number of parameters
// 2. Type of parameters
// 3. Order of parameters

class Calculator {
    int num = 5;
    public int add(int n1,int n2) {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3) {  // 1. Number of parameters
        return n1+n2+n3;
    }
    public double add(double n1,double n2) { // 2. Type of parameters
        return n1+n2;
    }
    public double add(int n1,float n2,double n3){
        return n1+n2+n3;
    }
    public double add(double n1,float n2,int n3){ // 3. Order of parameters
        return n1+n2+n3;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Calculator c1 = new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2.5,3.5));
        System.out.println(c.add(2,3.5f,4.5));
        System.out.println(c.add(2.5,3.5f,4));

        System.out.println("c: "+ c.num);
        System.out.println("c1: "+ c1.num);
        c.num = 10; // NOTE :Instance variable "num" changes only for 'c' object and not for 'c1' object 
        System.out.println("After c: "+ c.num);
        System.out.println("After c1: "+ c1.num);
        
        
    }
}

        