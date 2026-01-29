// A thread is the smallest unit of execution inside a program.
// Multithreading means running multiple threads at the same time within a single program.

class A extends Thread{
    // public void greet() {
    public void run() {
        for(int i = 0; i <= 100; i++){
        System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i = 0; i <= 100; i++){
        System.out.println("hello");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        // obj1.greet();
        // obj2.greet();
        // To call or run thread :
        // 1) .start - Schedules this thread to begin execution. 
        obj1.start();
        obj2.start();
        // Note - you might not see multithreading effect for small loops(0 to 10 or more) bcoz the machine is so fast that it executes a thread completely within small amount of time
        // Scheduler is the one who decides which threda to run when and for how much time
    }
}
