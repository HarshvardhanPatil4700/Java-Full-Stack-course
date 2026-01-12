class Human
{
	private int age;
	private String name;
	
    // Constructor Overloading : Multiple constructors with different parameters 
	public Human() // Default Constructor : Provided by Java only if no constructor is written (it provides the constructor with default values)
	{
        System.out.println("Default C");
		age=12;
		name="John";
    }
    public Human(int age) { // PC1
        System.out.println("Parameterized C"); 
        this.age = age;
    } 
    public Human(int age,String name) { // PC2
        System.out.println("Parameterized C");
        this.age = age;
        this.name = name;
    }
    
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

// Java doesn’t have built-in copy constructors, but we can create one.
class Student {
    int age;
    String name;

    Student(Student s) {
        this.age = s.age;
        this.name = s.name;
    }
}


public class DefaultAndParameterizedConstructor {
    public static void main(String[] args) {
        Human h = new Human(); // calls default constructor
        System.out.println(h.getName() + " : "  + h.getAge());
        Human h1 = new Human(18); // calls PC1
        System.out.println(h1.getAge());
        System.out.println(h1.getName() + " : "  + h1.getAge()); //Sets name with default value i.e null
        Human h2 = new Human(20,"Bob"); // calls PC2
        System.out.println(h2.getName() + " : "  + h2.getAge()); //Sets name with default value i.e null      
    }
}
/* 
Default constructor provided by Java :
public Human() {
}
 */