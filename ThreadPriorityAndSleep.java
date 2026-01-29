// Thread Priority decides which thread gets CPU preference when multiple threads are ready to run.
// 1  → MIN_PRIORITY  
// 100  → NORM_PRIORITY (default)
// 10 → MAX_PRIORITY
// Thread.MIN_PRIORITY   // p=1
// Thread.NORM_PRIORITY  // p=5
// Thread.MAX_PRIORITY   // p=10

// sleep() pauses the currently executing thread for a given time

class A extends Thread{
    public void run() { // every thread object must have the run() method
        for(int i = 0; i <= 100; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10); // throws exception (need try-catch block)
            } catch (InterruptedException ex) {
                System.getLogger(A.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i = 0; i <= 100; i++){
        System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.getLogger(B.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority()); // to know priority of thread
        // to set the priority to thread :
        obj1.setPriority(3);
        obj2.setPriority(Thread.MAX_PRIORITY); // Max priority means you are requesting the JVM to give this thread the highest preference for CPU time compared to other threads
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}
/*
MAX_PRIORITY = “Run me first if possible”, But not a guarantee.

Important Points :
1.Priority range: 1 to 10
2.JVM scheduler may choose this thread more often
3.Actual execution depends on: JVM, Operating System, System load

Note : MAX_PRIORITY does NOT mean -
The thread will always run first
Other threads will stop
Execution order is fixed */
