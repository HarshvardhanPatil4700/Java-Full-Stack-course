class Student {
    private int age = 18;
    private String name = "Alice";
    private int rollNo; // variables of class are private which can be accessed only by methods (Encapsulation)
    private String hobby;

    public int getAge() { // Getter
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getHobby() {
        return hobby;
    }

    public void setRollNo(int r) { //Setter
        rollNo = r;
    }

    public void setHobby(String h) { //Setter
        hobby = h;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName() + " is " + s.getAge() + " years old");
        s.setRollNo(45);
        System.out.println("Roll No : " + s.getRollNo());
        s.setHobby("Coding");
        System.out.println("Hobby : " + s.getHobby());
    }
}
