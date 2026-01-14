// Wrapper classes convert primitive data types into objects.Wrapper classes are immutable and Stored in heap
// int - Integer
// char - Character
// double - Double

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(8); warning
        Integer n1 = new Integer(num); // storing primitive value in object. this is called as Boxing
        Integer n2 = num; // autoboxing : automatically converts primitve to object(primitive → object) Now, n2 is an object
        System.out.println(n1 + " " + n2);
        Integer num1 = 8;
        System.out.println(num1);
        Double d = 91.1;
        Character c = 'W';
        System.out.println(d + " " + c);

        // to get value of the object : Unboxing (object → primitive)
        int value = n2.intValue();
        System.out.println(value);
        int v = n2; // auto-unboxing : automatically converts object to primitve(object → primitive) Now, v is an primitive
        System.out.println(v);

        // ParseInt : Converts the String value into integer value ("10" -> 10)
        String s = "12";
        int n = Integer.parseInt(s);
        System.out.println(n + " " + n*5);

        // Useful Wrapper class methods :
        int i = Integer.parseInt("123");    // String → int
        Integer x = Integer.valueOf("150");    // String → Integer
        System.out.println(i);
        System.out.println(x);
        boolean check = Character.isDigit('5');    // true
        System.out.println(check);
        boolean bool = Boolean.parseBoolean("true");
        boolean bool1 = Boolean.parseBoolean("tr");
        System.out.println(bool);
        System.out.println(bool1);
    }
}
// Why do we need Wrapper Classes?
// 1️.. Collections (ArrayList, HashMap) work with objects only
// 2. Frameworks (Hibernate, Spring) expect objects
// 3️. Utility methods (parseInt, valueOf)
// 4️. Enables null values

// Autoboxing (primitive → object)
// int a = 10;
// Integer obj = a;   // autoboxing (creates the object obj and stores the primitive value in object)

// Unboxing (object → primitive)
// Integer obj = 20;
// int a = obj;      // unboxing 
