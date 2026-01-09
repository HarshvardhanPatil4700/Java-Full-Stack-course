public class WhileLoop {
    public static void main(String[] args) {
        // while(true) {
        //     System.out.println("Hi");
        // } (Runs infinitely)

        int a = 1;
        while(a<=5) { // executes the block of code if the condition is true and continues executing until cond. is true
            System.out.println("Have a nice day!");
            a++;
        }
        System.out.println("Thank you");

        // Sum of First n Whole Numbers 
        int sum = 0, n = 5;

        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("Sum = " + sum);

        
        // Nested While loop :
        int i = 1;                // outer loop → rows
        while (i <= 3) {
            int j = 1;            // inner loop → columns
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); // new line after each row
            i++;
        }
    }
}
        

