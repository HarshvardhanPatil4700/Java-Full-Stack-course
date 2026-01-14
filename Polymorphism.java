// Polymorphism means “many forms”.In Java, it allows the same method or object to behave differently based on context.
// Types : 1. Compile-Time Polymorphism (Method Overloading)  2. Runtime Polymorphism (Method Overriding)

// 1. Compile-Time Polymorphism (Method Overloading) :
class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// 2. Runtime Polymorphism (Method Overriding) :
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meow Meow ");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        MathOps m = new MathOps();
        System.out.println(m.add(3, 2));
        System.out.println(m.add(3.5, 4.5));

        Animal obj = new Dog();
        obj.sound();
        Animal a = new Cat();
        a.sound();
    }
}