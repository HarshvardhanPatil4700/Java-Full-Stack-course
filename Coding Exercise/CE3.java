public class CE3 {
    public static void main(String[] args) {
        int score = 55;
        char grade = 'B';
 
        if (score >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
 
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}