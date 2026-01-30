// class Z {
// }
// class A extends Z,Thread { // Multiple inheritance is not supported in java
// }

// class A implements Runnable{
//     public void run() {
//         for(int i = 0; i <= 5; i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10); // throws exception (need try-catch block)
//             } catch (InterruptedException ex) {
//                 System.getLogger(A.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run() {
//         for(int i = 0; i <= 5; i++){
//         System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//                 System.getLogger(B.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//             }
//         }
//     }
// }

public class RunnableVSThread {
    public static void main(String[] args) {
        // Method 1 : Directly write the run method here as done below -
        Runnable obj1 = new Runnable() {
            public void run() {
                for(int i = 0; i <= 5; i++){
                    System.out.println("hi");
                try {
                    Thread.sleep(10); // throws exception (need try-catch block)
                } catch (InterruptedException ex) {
                    System.getLogger(A.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
                }
            }
        };
    
        // Method 2 : simplify the code more using lamba expression as Runnable is a Functional Interface
        Runnable obj2 = () -> {
            for(int i = 0; i <= 5; i++){
                System.out.println("hello");
            try {
                Thread.sleep(10); // throws exception (need try-catch block)
            } catch (InterruptedException ex) {
                System.getLogger(A.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            }
        };
        // a.start();
        // b.start(); We cannot run thread like this as 'start' was the method present in Thread class which can be used only if thread is created by extending Thread class and Not when creating thread by implementing Runnable.

        Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2); we can also give a name to a thread as:
        Thread t2 = new Thread(obj2, "threadName");

        t1.start();
        t2.start();
    }
}
/*
Note :
thread can be created by 2 ways :
1. by extends Thread class - class A extends Thread {}
2. by implementing Runnable interface - class A implements Runnable {} 
But we cannot use the RunnableObject.start() ,as the start is method of Thread class so we make a runnable object which is shoot by the thread object and then we run those thread objects */