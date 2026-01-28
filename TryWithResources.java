// finally block - A block that always executes, whether exception occurs or not, Used to clean up resources (close files, streams, DB connections)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int i = 2;
        int j = 0;
        try {
            j = 10/i;
            System.out.println("Something went wrong in try!"); // this will not run if exception is present (if i = 0) bcoz control moves to catch block from above line
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
            System.out.println("Something went wrong in catch!"); // Similarly,this will not be executed if exception is absent (i != 0) bcoz no exception is thrown and catch block is ignored
        }
        finally { 
            System.out.println("Try Again");
        }

        // int num = 0;
        // BufferedReader br = null; // declare it outside so that both try and finally blocks can use it
        // try {
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // } finally{
        //     br.close();
        // } This can be done by using try with resources(better replacement of finally) as : 
        int num = 0;
        System.out.print("Enter a number : ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { //Advantage: br is close automatically 
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
