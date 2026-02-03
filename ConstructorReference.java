import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private int age;
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    
}
public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harsh", "Navin", "Raj");

        List<Student> students = new ArrayList<>();

        // for(String name : names) {
        //     students.add(new Student(name));
        // }

        students = names.stream()
                        // .map(name -> new Student(name)) this can be implemented in better way using constructor reference as :
                        .map(Student::new)
                        .toList();

        System.out.println(students);
    }
}
/*
A constructor reference is a special type of method reference used to refer to a class constructor instead of writing a lambda expression. Introduced in Java 8, it uses the ::new syntax. 
Syntax - ClassName::new

Lambda - Supplier<List<String>> s = () -> new ArrayList<>();
Constructor reference - Supplier<List<String>> s = ArrayList::new;
*/
