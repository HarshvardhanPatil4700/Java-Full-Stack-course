// enum with switch
enum Status {
    SUCCESS, FAILED, PENDING
}

// enum with Fields & Constructor
enum Laptop {
    HP(50000), DELL(60000), ASUS(55000);

    int price;

    Laptop(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}

public class EnumSwitchAndOtherExamples {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;
        switch (s) {
            case SUCCESS:
                System.out.println("Success");
                break;
            case FAILED:
                System.out.println("Failed");
                break;
            case PENDING:
                System.out.println("Pending");
                break;
        }
        
        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}

