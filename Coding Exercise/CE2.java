public class CE2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
 
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
 
        boolean isGreater = a > b;
        boolean logicalCheck = a > b && b > 0;
 
        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a > b and b > 0? " + logicalCheck);
    }
}