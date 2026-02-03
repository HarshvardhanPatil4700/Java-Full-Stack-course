// parallelStream() in Java is a way to process collection elements in parallel (using multiple threads) instead of one-by-one (work is divided and done at the same time on multiple CPU cores.)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i <= size; i++) {
            nums.add(ran.nextInt(100)); // inserts the random nubers less than 100 in nums list
        }

        int sum1 = nums.stream()
                        .map(i -> i*2)
                        .reduce(0,(a,b) -> a+b);

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(i ->{ 
                            try {
                                Thread.sleep(1); // sleeps for every input i.e 1 milliseconds * 10,000 = 10 seconds.So, we get o/p after 10s
                            } catch (Exception e) {
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i) // convert the 'nums' stream to IntStream with same value (i -> i)
                        .sum();
        long endSeq = System.currentTimeMillis();              

        long startParallel = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(i -> i*2)
                        .mapToInt(i -> i) // convert the 'nums' stream to IntStream with same value (i -> i)
                        .sum();
        long endParallel = System.currentTimeMillis();
                        
        System.out.println(sum1 + " " + sum2 + " " + sum3);
        System.out.println("time of Sequential = " + (endSeq - startSeq));
        System.out.println("time of Parallel = " + (endParallel - startParallel));

        // Example of parallelStream - 
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5);

        nums1.parallelStream()
            .forEach(n ->
            System.out.println(n + " - " + Thread.currentThread().getName())
        );
    }
}
/*
How it works (internally) -
Splits the collection into smaller chunks
Processes chunks in multiple threads
Merges the results at the end
Uses ForkJoinPool.commonPool() 

When to use parallelStream() -
Large collections
CPU-intensive operations
Stateless operations
No shared mutable data
*/