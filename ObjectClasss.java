// 1. Object class :
// The Object class is the root (superclass) of all classes in Java. in Package: java.lang.It is Implicit inheritance: Every class in Java automatically extends Object if no other parent is specified.provides common methods to all java classes (when objectName.)
// class Student {
// }

// the class Strudent internally becomes 
// class Student extends Object {
// }

// Some of the methods of Object class are : 
// 2. toString() : Returns string representation of an object
// 3. equals(Object obj) : Compares content, not reference (if overridden).Note :the Object class's equals(obj) method compare reference and not the content so we need to override the method in the class (as done in class Computer) 

class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }
}

// To auto-generate the toString() : place the cursor in the class in which you want it, Press Ctrl + . then select 'source actions' and then select 'Generate toString()',Select the fields you want and press OK
// To auto-generate the equals() and hashcode() : place the cursor in the class in which you want it, Press Ctrl + . then select 'source actions' and then select 'Generate hashcode() and equals()',Select the fields you want and press OK
class Comp {
    String model;
    int price;

    // public String toString() {
    //     return model + " : " + price;
    // }
    // the auto generated toString() is :-
    @Override
    public String toString() {
        return "Comp [model=" + model + ", price=" + price + "]";
    }
    
    // public boolean equals(Comp c) {
    //     // if(this.model.equals(c.model) && this.price == c.price) 
    //     //     return true;
    //     // else
    //         //     return false;
        
    //     return this.model.equals(c.model) && this.price == c.price;
    // }

    // Auto-generated the equals() and hashcode() : it checks for multiple cases
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Comp other = (Comp) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
}

public class ObjectClasss {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.model = "Apple Mac M1";
        l.price = 10000;
        
        // System.out.println(l); // whenever we print the object, it calls teh .toString() method which is built method in the 'Object' class
        System.out.println(l.toString()); // toString = getClass().getName() + '@' + Integer.toHexString(hashCode()) i.e It gives ClassName + @ + hashcode in HexString
        // Hence, System.out.println(l) and System.out.println(l.toString()) these both are same (i.e call toString()). Both call the toString (which is in-built one) but if we have give implementation to toString(as given above) then it implements it
        
        // Equals :
        Comp c1 = new Comp();
        c1.model = "Computer";
        c1.price = 10000;
        Comp c2 = new Comp();
        c2.model = "Computer";
        c2.price = 10000;
        boolean b = c1.equals(c2); // uses the overriden equals() method of Computer class and not the built in equals method of Object class 
        System.out.println(b);
    } 
}
