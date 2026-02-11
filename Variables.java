public class Variables {
    public static void main(String[] args) {
        System.out.println(3+2);
        // num = 4; compile time error
        int num = 4; 
        System.out.println(num);
        System.out.println(num+6);
        System.out.println((num+6)*5);

        int num2 = 8;
        System.out.println(num+num2);
        System.out.println(num-num2);
        System.out.println(num*num2);
        System.out.println(num2/num);
        System.out.println(num2%num); // remainder

        boolean b1 = true;
        boolean b2 = false;
        boolean res1 = b1 || b2;
        System.out.println(res1);
        boolean res2 = b1 && b2;
        System.out.println(res2);
        System.out.println(!res2);

        int a = 10;
        int A = 15; // 'a' and 'A' are different variables as Java is case-sensitive language

        // Default Values: If you choose not to assign a value during variable declaration, Java automatically assigns a default value based on the data type:
        int x;
        boolean b;
        double d;
        char c; // default value of char is '\u0000'
        String s; //Object default value is null
        System.out.println(x + " " + b + " " + d + " " + c + " " + s);
    }
}
