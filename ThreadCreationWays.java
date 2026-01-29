// Thread Creation Ways :
// 1. Thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread created by extending Thread class");            
        }
    }
}

// 2. Thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread created by implementing Runnable interface");            
        }
    }
}

public class ThreadCreationWays {
    public static void main(String[] args) {
        // Thread using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Thread using Runnable interface
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
