enum Status {
    SUCCESS, FAILED, PENDING
}

public class EnumIfElse {
    public static void main(String[] args) {

        Status s = Status.SUCCESS;
        
        if (s == Status.SUCCESS) {
            System.out.println("Operation successful");
        } 
        else if (s == Status.FAILED) {
            System.out.println("Operation failed");
        } 
        else if (s == Status.PENDING) {
            System.out.println("Operation pending");
        }
        else {
            System.out.println("Processing⌛");
        }
    }
}
