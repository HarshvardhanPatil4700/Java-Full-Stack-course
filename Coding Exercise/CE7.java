
class Employee {
    private String name;
    private double salary;
 
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
 
    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
 
    public String getName() {
        return name;
    }
 
    public double getSalary() {
        return salary;
    }
}
 
class Manager extends Employee {
    private String department;
 
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
 
    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }
} 
 
public class CE7 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Employee mgr = new Manager("Bob", 80000, "IT");
 
        System.out.println(emp.getDetails());
        System.out.println(mgr.getDetails());
    }
}