public class TypeConversionAndCasting {
    public static void main(String[] args) {
        // Type conversion (implicit / widening)
        byte b = 120;
        int a = b; // converts byte to int (Type conversion)
        System.out.println(a);
        int n1 = 10;
        double d = n1; // converts int to double (Type conversion)
        System.out.println(d);
        char ch = 'A';
        int n = ch; // converts char to int (ASCII value) (Type conversion)
        System.out.println(n);

        // Type Casting (Explicit / Narrowing)
        int x = 12;
        // byte k = x; incompatible types: possible lossy conversion from int to byte
        byte k = (byte) x;
        System.out.println(k);
        // If value is out of range :
        int y = 257;
        byte m = (byte) y; // byte range is 0 to 256
        System.out.println(m); // in such case it performs the modulo by range i.e number % range => 257 % 256 = 1 (o/p)
        int c = (int) 10.75;
        System.out.println(c); // Data Loss of decimals digits

        int z = 130;
        byte b1 = (byte) z;
        System.out.println(b1); // -126 (data overflow)

        // Type promotion :
        byte h = 10;
        byte f = 30;
        // byte res = h*f;  res = 300 which is out of range of byte 
        int res = h*f;
        System.out.println(res);
    }
}
