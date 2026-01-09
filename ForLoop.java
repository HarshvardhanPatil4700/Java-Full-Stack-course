// The for loop is used when you know in advance how many times you want to repeat a block of code.
// Format :-  
// for (initialization; condition; increment/decrement) {
//     code to be executed
// }


public class ForLoop {
    public static void main (String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Hi " + i );
        }
        System.out.println("Well done");

        char c;
        for(c = 'H'; c>='A'; c--) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Another way :
        int i =1;
        for(;i<=3;) {
            System.out.println(i);
            i++;
        }

        // Infinite for loop :
        // for (;;) {
        //     System.out.println("Hello");
        // } 

        // Nested For loop :
        System.out.println("Multiplication table of 5 :");
        for (int x = 5; x == 5; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + " x " + y + " = " + (x * y));
            }
            System.out.println();
        }
    }
}
