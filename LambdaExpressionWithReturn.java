interface A {
    int add(int i, int j);
}

public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        // Anonymous inner class
        // A a = new A() {
        //     public int add(int i, int j) {
        //         return i+j;
        //     }
        // };
        // a.add(5, 3);

        // Replacement : using lambda expression with return -
        // A a = (int i,int j) -> {
        //     return i+j;
        // };

        // A a = (int i, int j) -> return i+j; We can directly write i+j as :

        A a = (i, j) -> i+j;
        int sum = a.add(5, 3);
        System.out.println(sum);
    }
}
