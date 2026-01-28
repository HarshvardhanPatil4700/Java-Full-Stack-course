import java.io.BufferedReader;// BufferedReader works with IO so we need to import it 
import java.io.IOException; // System.in.read() throws the IOException
import java.io.InputStreamReader; // to use InputStreamReader by creating its object

public class UserInputUsingBufferedReaderAndScanner {
    public static void main(String[] args) throws IOException {
        /*System.out.println("Enter a number : ");
        int num = System.in.read(); // the System.in.read() returns an ASCII value (int) 
        // System.out.println(num);
        System.out.println(num - 48);  //to get the exact value of the number(but this works only for single digit number)*/

        InputStreamReader n = new InputStreamReader(System.in); // pass 'System.in' as object for InputStreamReader
        BufferedReader br = new BufferedReader(n); // pass the object of InputStreamReader in BufferedReader(then it takes input from user) Or do as done below: 
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        br.close(); // We close BufferedReader to release system resources and free the input stream, preventing memory leaks

        // By using Scanner Class : Cannot works here bcoz br.close(); closes the System.in
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name1 = s.nextLine();
        // System.out.print("Enter your age: ");
        // int age1 = s.nextInt();

        // System.out.println("Name: " + name1);
        // System.out.println("Age: " + age1);
    }
}
/*
Key points :
1.BufferedReader (java.io)
Used to read text input efficiently
Faster than Scanner (uses internal buffering)
Reads data as String
Requires manual type conversion (Integer.parseInt())
Uses readLine() to read full line
Throws checked exception (IOException)
Best for large input / performance-critical programs
Wraps an InputStreamReader when used with System.in
Closing it also closes System.in

2.Scanner (java.util):
Used to read input in tokenized form
Slower than BufferedReader
Supports direct data type input (nextInt(), nextDouble())
Uses regex internally
No checked exception handling required
Easy to use and beginner-friendly
next() reads one word, nextLine() reads full line
Common issue: newline leftover after numeric input
Closing it also closes System.in
*/