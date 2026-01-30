
class PrinterTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}
 
public class CE11 {
    public static void main(String[] args) {
        Runnable task = new PrinterTask();
 
        Thread t1 = new Thread(task, "Worker-1"); // task is Runnable object
        Thread t2 = new Thread(task, "Worker-2");
        
        t1.start();
        t2.start();
 
        try {
            t1.join();
            t2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 

/*
"Worker-1" : This is the name of the thread
Name for thread is Helpful for: Debugging, Logging, Identifying threads in stack traces.
You can access it using: Thread.currentThread().getName();
*/