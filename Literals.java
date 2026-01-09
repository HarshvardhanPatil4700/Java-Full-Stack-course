public class Literals {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 0b101; // binary numbers has prefic as: 0b => eg:1010 binary no. is written as : 0b1010;
        System.out.println(n2);
        int n3 = 0x1A2E7; // Hexadecimal numbers has prefic as: 0x => eg:1A2C binary no. is written as : 0x1A2C;
        System.out.println(n3);
        int n4 = 10_04_18_400; // same as 100418400 
        System.out.println(n4);

        double d = 15; // d = 15.0
        System.out.println(d);
        double d1 = 12e10; // 12 raised to 10 = 1.2 power of 11
        System.out.println(d1);

        // boolean b = 1; int cannot be converted to boolean

        char c = 'a';
        System.out.println("Before inc : " + c);
        c++; 
        System.out.println("After inc : " + c);

    }
}
