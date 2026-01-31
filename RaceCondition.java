// No — threads themselves are NOT mutable. But they work with mutable data, and that’s where problems start.
// A race condition happens when multiple threads access and modify shared data at the same time, and the final result depends on the timing/order of execution of those threads (Threads “race” to update shared data gives unpredictable output)
// synchronized - A keyword used to control access to shared data in multithreading. It allows only ONE thread at a time to execute a critical section. the Other threads wait for the lock and it Prevents race condition(Ensures thread-safe increment by allowing only one thread to access the method at a time using intrinsic lock)
// join - A method of the Thread class It makes current thread wait until another thread finishes execution, Does NOT provide data safety and Used for execution order, not synchronization. It throws InterruptedException.

class Counter
{
	int count;
	// public void increment() // this method block any thread during execution of multiplt threads hence shared data can be accessed by any thread and cause race
	public synchronized void increment() // ensures only one thread access the shared data at single time and other thread are locked
	{
		count++;
	}
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException{   
    	
    	Counter c=new Counter();
    	
    	Runnable obj1=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Runnable obj2=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    	
    	t1.join(); // Main thread waits until t1 completes.
    	t2.join(); // Main thread waits until t2 completes.

    	// main thread can now start its remaining execution
    	System.out.println(c.count);
    }
}
/*
synchronized : Purpose - Thread safety (mutual exclusion)
Controls access to shared resources
Only one thread at a time can execute the synchronized block/method
Other threads wait for the lock
Prevents race condition 

join() : Purpose - Execution order
Makes current thread wait until another thread finishes
Does not protect shared data
No locking mechanism

synchronized waits for lock
join() waits for thread completion
(synchronized ensures mutual exclusion for shared data, while join() ensures one thread waits for another to complete)
*/

    