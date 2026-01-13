import java.util.Scanner;
import other.tools.AdvCalc;
import other.tools.Calc;

public class Packages {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(3,4));
        AdvCalc a = new AdvCalc();
        System.out.println(a.multiply(5, 2));
        Scanner s = new Scanner(System.in);
        System.out.print("Enter you name : ");
        String name = s.next();
        System.out.println("Name : " + name);
        System.out.println(); // System is also a class which lies in java.lang.System ,But we need to not import in every file as it present by default in every java file
    }
}