// Arithematic Operators : + , - , * , / , % , += ,-=,*=,/=,%=,++,--

public class ArithematicOperators {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 5;
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
        System.out.println(n1%n2);

        n1 += 3; // same as => n1 = n1 + 3; = 7 + 3 = 10
        System.out.println("After add : " + n1);
        n1++;  // Post-Increment operator => same as n1 = n1 + 1;
        System.out.println("After inc : " + n1);
        n1 -= 5;
        System.out.println(n1);
        n1--; // Post-Decrement Operator => same as n1 = n1 - 1;
        System.out.println(n1);
        // Pre-Increment and Pre-Decrement operators
        ++n1;
        System.out.println(n1);        
    }
}
// Post inc : n++ => Fetch the value and then increment the value (First use, then increment the value). Inc later
// Pre inc : ++n => Increment the value and then fetch the value (First increment, then use the value). Inc first