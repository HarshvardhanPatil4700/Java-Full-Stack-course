public class JaggedAnd3DArray {
    public static void main(String[] args) {
        // Jagged Array:A jagged array is a multidimensional array where each row can have a different length(i.e the arrays are of different length)
        int nums[][] = new int[3][]; // Declaration og jagged array (there are 3 arrays of diff lengths)
        nums[0] = new int[3]; // length of array is 3
        nums[1] = new int[2]; // length of array is 2
        nums[2] = new int[5]; // length of array is 5

        for(int i = 0; i < nums.length; i++) { // 0 to 2
            for(int j = 0; j < nums[i].length; j++) { // 0 to lenght of array-1
                nums[i][j] = (int)(Math.random()*10); // gives a random no. between 0 - 9
            }
            System.out.println();
        }
        for(int n[] : nums) {
            for(int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // example 2 :
        System.out.println("Example 2 : ");
        int [][]jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // 3D Array :
        int[][][] a = new int[2][3][4]; //Declaration & Initialization
        int[][][] arr = {
            {
                {1, 2}, {3, 4}
            },
            {
                {5, 6}, {7, 8}
            }
        };

        // Traversal in 3d array :
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
