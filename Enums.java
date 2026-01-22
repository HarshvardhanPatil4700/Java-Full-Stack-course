// An enum (enumeration) is a special data type used to define a fixed set of constants. i.e named set of constants

enum Status { // Java treats the 'enum' as class and all teh constants of enum as objects of class
    Running, Pending, Failed,  Success;
}
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}
public class Enums {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        Status s1 = Status.Failed;
        System.out.println(s1);
        // Status s = Status.Error; 'Error' cannot be resolved or is not a field (not a part of named constants)

        // The java by default assigns the index to named constants of enum from 0 to n-1 (n is total named constants).it can be known by using the enumObj.ordinal() method
        System.out.println(s.ordinal());
        System.out.println(s1.ordinal());

        // to get all the constants :
        Status S[] = Status.values();
        // System.out.println(S); gives teh address of array
        for (Status a : S) {
            System.out.println(a.ordinal() + " : " + a);
        }

        Day d = Day.MON;
        System.out.println(d);
        System.out.print("Week : ");
        Day D[] = Day.values();
        for(Day d1 : D) {
            System.out.print(d1 + " ");
        }

        
    }
}
// enum implicitly extends java.lang.Enum
// Cannot extend another class
// Constructors are private by default
// Can have methods, variables, constructors
// Enum constants are public static final