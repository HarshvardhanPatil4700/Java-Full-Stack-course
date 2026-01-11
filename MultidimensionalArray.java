// A multidimensional array in Java is an array of arrays.
// 1. Java does not support true multidimensional arrays; it supports array of arrays
// 2. Memory is not contiguous for all elements
// 3. arr.length → number of rows
// 4. arr[i].length → number of columns in that row

// types of declaring multidimensional array :
// 1. int[][] arr = {
//      {1, 2, 3},
//      {4, 5, 6}
//    };

// 2. int[][] arr = new int[2][3]; // 2 rows, 3 columns

public class MultidimensionalArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][4]; // initialises the array with 3 rows and 4 colums(3 arrays with length of all arrays as 4) with values as 0.

        // retriving / accessing data of arrays :
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random()*10); // gives a random no. between 0 - 9
            }
            System.out.println();
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Enhaced For loop : pros is - we dont have to mention the array length
        for(int n[] : nums) {
            for(int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

// Enhaced For loop (for-each loop):
// for (dataType variable : arrayOrCollection) {
//     // code
// }

