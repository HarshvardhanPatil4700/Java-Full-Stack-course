class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class MethodOverridingExamples {
    public static void main(String[] args) {
        Bank b;

        b = new SBI(); // same as Bank b = new SBI();
        System.out.println(b.getInterestRate()); // 6.5

        b = new HDFC();
        System.out.println(b.getInterestRate()); // 7.0
    }
}

