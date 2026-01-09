// Logical Operators : || (logical OR) : atleast one must be true , && (logical AND) : all must be true , ! (logical NOT) : complements the value.

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a > b;
        System.out.println(result);
        boolean result1 = x > y || a > b || a>3; 
        System.out.println(result1);

        boolean notOp = !(x>y);
        System.out.println(notOp);
        System.out.println(!result);
    }
}
