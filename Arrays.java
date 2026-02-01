// Types of Creation / Inialization of Arrays :
    // 1. Declaration → Creation → Initialization
    // int[] arr;           declaration
    // arr = new int[5];    creation

    // 2. Declaration + Creation (Without Values)
    // int[] arr = new int[5];  This type initializes the array with fixed size with the values of all elements as 0.

    // 3. Declaration + Creation + Initialization (With Values)
    // int[] arr = {10, 20, 30, 40, 50};

    // 4. 
    // int[] arr = new int[] {1, 2, 3};

import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        // Fetching data of array using index
        int nums[] = {5,10,15,20,25,30};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[nums.length - 1]); //last element of array = n-1 (where n = length i.e no. of elements of array)

        // Updating values of array 
        nums[2] = 50;
        System.out.println("After update : " + nums[2]);

        int a[] = new int[4]; //This type of declaration initializes the array with fixed size with values of all elements as 0.
        // System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
        // a[0] = 2; a[1] =4; a[2] = 6; a[3] = 8;
        // System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
        // Fetching data using loop :
        for(int i = 0; i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        a[0] = 2; a[1] =4; a[2] = 6; a[3] = 8;
        System.out.println();
        for(int i = 0; i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static List<String> asList(String string, String string2, String string3, String string4, String string5) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
