// Types of Blocks : If-Else , If - Else if - Else

public class IfElseBlocks {
    public static void main(String[] args) {
        // 1.If-Else
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        int x = 10;
        int y = 15;
        if(x>y) 
            System.out.println(x + " is greater than " + y);
        else 
            System.out.println(y + " is greater than " + x);

        int a = 10;
        int b = 20;
        int c = 15;
        if(a<c && b>=c && c>0) {
            System.out.println("c is a natural no. and lies in 10 - 20");
        }else {
            System.out.println("c does not lie in 10 - 20");
        }
        System.out.println("c = " + c); // this part of code is always executed whether the condition is true or false

        // 2. If - Else if - Else 
        int n1 = (int)(Math.random() * 10) + 1;
        int n2 = (int)(Math.random() * 10) + 1;
        int n3 = (int)(Math.random() * 10) + 1;
        System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is greater than " + n2 + " and " + n3 );
        }
        else if(n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is greater than " + n1 + " and " + n3 );
        }
        else {
            System.out.println(n3 + " is greater than " + n1 + " and " + n2 );
        }        
    }
}

// NOTE :
// if(1) {
//     System.out.println("Hello world");
// } GIVES A COMPILE TIME ERROR