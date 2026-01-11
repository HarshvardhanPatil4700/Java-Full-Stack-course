// Working with Arrays in Java: From Basics to Enhanced For Loops
// You are given an array of integers. Your task is to write a Java program that finds and prints the smallest and largest numbers from the array using an enhanced for loop (also known as a for-each loop).

// This will help you practice iterating through arrays efficiently while tracking values.

// Instructions:

// 1. Use the following array in your program:
// int[] numbers = {45, 22, 89, 16, 90, 33};

// 2. Declare two variables:

// One to keep track of the smallest number (initialize with the first element).

// One to keep track of the largest number (also initialize with the first element).

// 3. Use a for-each loop to iterate over the array.

// 4. Update the smallest and largest variables as you compare each element.

// 5. Print both values using System.out.println() in this exact format:

// Expected Output:
//   Smallest:  16
//   Largest:  90

public class CE6 {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 16, 90, 33};
        // TODO: Initialize min and max with the first element
        int min = 45;
        int max = 45;
        // TODO: Use an enhanced for loop to find min and max
        for(int n : numbers) {
            if (n<min) {
                min = n;
            }
        }
        for(int n : numbers) {
            if (n>max) {
                max = n;
            }
        }
        // TODO: Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
