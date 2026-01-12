class Human
{
	private int age;
	private String name;
	
	public Human() // Default Constructor : Provided by Java only if no constructor is written.
	{
        System.out.println("in constructor");
		age=12;
		name="John";
	} // Now, when an object is created, its instance variables are assigned with values stated in constructor
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

class Patient {
    private String name;
    private int age;

    public Patient() {
        name = "ABC";
        age = 15; // (condition: doctor accepts patient with age >= 15)
        System.out.println(name + " : " + age);
    }
}

public class Constructor {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human(); //whenever we create a new object it initializes the variables with default values(i.e string with null and int with 0) To avoid this,we can use constructor which set the initial values for variables as soon as new object is created (Here, age = 12 and name : John) 
		Human obj1=new Human();
		System.out.println(obj.getName()+" : "+obj.getAge());
		
		obj.SetAge(30);
		obj.setName("Reddy");
        System.out.println(obj.getName()+" : "+obj.getAge()); // It takes values set by setters as the setters overwrites the constructor values.As, the object obj1 is not assigned any values it takes default values stated in constructor.

        Patient p = new Patient();
	}
}
// KEY POINTS :
// A constructor is a special method used to initialize objects.
// It is called automatically when an object is created using new.
// Name must be same as class name
// No return type (not even void)
// Called only once per object
// Can be overloaded
// Cannot be static, final, or abstract