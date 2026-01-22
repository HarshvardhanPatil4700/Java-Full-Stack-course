interface A {
    int x = 10;
    String name = "ABC";
    void show();
    void config();
}

interface X {
    void run();
}

class B implements A,X { // a class can implement multiple interfaces (the class should must have implementation of all teh methods of both class)
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("Running");
    }
}

interface Y extends X { // the extends keyword is used by an interface to inherit another interface
    void display();
    int getAge(int a);
}

class ABC implements Y { // this class must implement the run() which is extended in Y from X via extends else gives error
    private int age;
    public void run() {
        System.out.println("Running");
    }
    public void display() {
        System.out.println("In display");
    }
    public int getAge(int age) {
        this.age = age;
        return age;
    }

}

public class Interfaces {
    public static void main(String[] args) {
        A obj;
        B ob = new B();
        ob.show();
        ob.config();
        ob.run();

        ABC a = new ABC();
        a.run();
        a.display();
        System.out.println(a.getAge(25));
    }
}
