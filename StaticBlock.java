// A static block is a block of code that executes once when the class is loaded into memory. If there is no object created then static block is not executed
// Key Points : Executes before main()
// Runs only once
// Used for static variable initialization
// Cannot use this or super
// Multiple static blocks are allowed (executed top to bottom)

class Mobile{
    String brand;
    int price;
    static String name;

    static { // executed only once when class is loaded
        System.out.println("in static block");
        name = "Phone";
    }
    public Mobile() { // executed when new object is created
        System.out.println("In constructor block");
        brand = "";
        price = 2000;
    }

    public void show() {
        System.out.println(brand + " " + name +  " : " + price);
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile"); // loads the class in memory
        // Mobile m1 = new Mobile();
        // m1.brand = "Apple";
        // m1.price = 1500;
        // Mobile.name = "Smartphone";

        // Mobile m2 = new Mobile();
    }
}
