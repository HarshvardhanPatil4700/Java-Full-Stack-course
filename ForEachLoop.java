// It is also called as Enhanced for loop. Used to traverse arrays and collections easily.

public class ForEachLoop {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        for(int a : nums) {
            System.out.print(a + " ");
        }
        System.out.println();

        Student s1 = new Student(); 
        s1.name = "Steve";
        s1.marks = 80;
        Student s2 = new Student();
        s2.name = "Jack";
        s2.marks = 70;
        Student s3 = new Student();
        s3.name = "Williams";
        s3.marks = 90;

        Student s[] = new Student[3]; // array of objects
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for(Student st : s) {
            System.out.println(st.name + " : " + st.marks);
        }

        // to calculate sum of n numbers : 
        int sum = 0;
        int arr[] = {10,20,30,40};
        for(int x : arr) {
            sum+=x;
        }
        System.out.println("Sum = " + sum);
    }
}

// Key Points :
// 1. No index needed
// 2. Read-only (cannot modify structure)
// 3. Works with arrays & collections
// 4. Simpler and cleaner than normal for loop

// Trick fo rformat of for-each loop : 
// for(returnType varName : arrOrCollection){ the varName is the variable which will strore data as it traversearray or collection
//     //code
// }
