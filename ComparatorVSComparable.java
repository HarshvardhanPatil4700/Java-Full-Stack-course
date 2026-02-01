import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student {
//     int age;
//     String name;
//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }
//     @Override
//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }    
// }
class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    @Override
    public int compareTo(Student that) { // the class needs to implement Comparable<Object>
        if(this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class ComparatorVSComparable {
    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if(i%10 > j%10) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // }; This can be done usign Lambda expression (Comparator is Functional Interface) as :
        Comparator<Integer> com = (i, j) -> {
            if(i%10 > j%10) { // Sort based on the lastDigit of the numbers 
                return 1;
            } else {
                return -1;
            }
        };

        Comparator<String> comp = (i, j) -> Integer.compare(i.length(), j.length()); // sort based on length of string

        Comparator<Student> compa = new Comparator<Student>() {
            public int compare(Student i, Student j) { // sort based on age 
                if(i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        
        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(38);
        nums.add(91);
        nums.add(72);
        System.out.println(nums);
        Collections.sort(nums); // performs sorting
        System.out.println(nums);

        // using comparator :
        Collections.sort(nums, com);
        System.out.println(nums);

        // question : Create a comparator which sorts Strings based on length 
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Bob");
        names.add("Williams");
        names.add("Jack");
        names.add("Christopher");
        Collections.sort(names,comp);
        System.out.println(names);

        List<Student> studs = new ArrayList<>();
        // studs.add(21, "abc"); error
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kiran"));
        
        // Collections.sort(studs,compa); // use this while using comparator compa
        Collections.sort(studs); // use this when we override the compareTo method in Object (here,we dont need comparator)
        System.out.println(studs);
    }
}
/*
1. Comparator (java.util) - Used to define custom ordering. It is Implemented outside the class
Key Points - Method: compare()
Does not modify original class
Multiple sorting logics possible
Best for flexible sorting 
Eg :
Comparator<Student> comp = (a, b) -> a.marks - b.marks;
Collections.sort(list, comp);

2. Comparable (java.lang) - Used to define natural/default ordering of objects. Implemented inside the class
Key Points - Method: compareTo()
Modifies original class
Only one sorting logic
Used when class has a natural order
Eg :
class Student implements Comparable<Student> {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}
Collections.sort(list);
*/