public class CE4 {
    public static void main(String[] args) {
        // For Loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i < 5) 
              System.out.print(" ");
        }
        System.out.println();
 
        // While Loop
        System.out.print("While Loop: ");
        int j = 1;
        while (j <= 5) {
            System.out.print(j);
            if (j < 5) 
              System.out.print(" ");
            j++;
        }
        System.out.println();
 
        // Do-While Loop
        System.out.print("Do-While Loop: ");
        int k = 1;
        do {
            System.out.print(k);
            if (k < 5)
              System.out.print(" ");
            k++;
        } while (k <= 5);
        System.out.println();
    }
}
