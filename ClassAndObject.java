// NOTE :
// 1. A class does not occupy memory until an object is created
// 2. Objects are instances of a class
// 3. One class can create multiple objects
// 4. Object occupies memory
// 5. Objects interact using methods (access variables and other methods of class)

class Calculator  {
    int a; // Variable declarations (Properties of object)

    public int add(int n1, int n2) {
        int r = n1+n2;
        return r; // the value of 'r' will be assigned to the variable which will call the add() method   
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;

        Calculator calc = new Calculator(); // Creating object from the Calculator class

        int res = calc.add(num1,num2);
        System.out.println(res);
    }
}
