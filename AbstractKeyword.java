// Abstract keyword - A non-access modifier used to achieve abstraction by defining abstract classes and methods.It is used to define incomplete classes or methods that must be implemented by subclasses.(it has no body)
// Abstract class may or may not have the abstarct methods(may or may have abstract or non abstract(concrete) class) but abstract method must be present in abstract class 

abstract class Car {
    // public abstract void drive(); The abstract method drive in type Car can only be defined by an abstract class
    public abstract void drive(); // declaration of abstract method(and whichever class extends it must implement it else gives error)
    public abstract void incSpeed();
    public void playMusic() {
        System.out.println("Playing music");
    }
}

class RollsRoyce extends Car { // The type RollsRoyce must implement the inherited abstract method Car.drive() i.e the abstarct method must be override in the class which extends the abstract class
    public void drive() {
        System.out.println("Driving RollsRoyce");
    }
    public void playMusic() {
        System.out.println("Playing music in RollsRoyce");
    }
    public void incSpeed() {
        System.out.println("Accelerating RollsRoyce");
    }
}

abstract class Bentley extends Car { // this class inherits the abstract class Car but does not implement the incSpeed Abstarct method.In such case, the class must be abstract (but then we cannot create object of this class)
    public void playMusic() {
        System.out.println("Playing music in Bentley");
    }
    public void drive() {
        System.out.println("Driving Bentley");
    }
}

class NewBentley extends Bentley { 
    public void playMusic() {
        System.out.println("Playing music in Bentley");
    }
    public void drive() {
        System.out.println("Driving Bentley");
    }
    public void incSpeed() {
        System.out.println("Accelerating bentley");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // Car c = new Car(); we cannot create object of abstract class
        RollsRoyce r = new RollsRoyce();
        r.drive();
        r.playMusic();

        NewBentley b = new NewBentley();
        b.drive();
        b.playMusic();

        Car c = new NewBentley();
        c.drive();
        c.playMusic();
    }
}
