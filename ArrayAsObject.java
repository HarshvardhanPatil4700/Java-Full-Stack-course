// In Java, arrays are objects because -
// 1.Arrays are created using new
// 2.They are stored in heap memory
// 3.They have a class and properties

class Student {
    String name;
    int marks;
}

public class ArrayAsObject {
    public static void main(String[] args) {
        int nums[] = new int[6];
        nums[0]=2;
        nums[1]=4;
        nums[2]=6;
        nums[3]=8;

        for(int i = 0; i < nums.length ; i++) { // this is good method to mention (< arrName.length) so that we dont have to remember the length of array to mention in loop
            System.out.print(nums[i] + " ");
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

        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for(int i = 0; i<s.length;i++) {
            System.out.println(s[i].name + " : " + s[i].marks);
        }
    }
}
