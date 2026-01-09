public class Variables {
    public static void main(String[] args) {
        System.out.println(3+2);
        // num = 4; compile time error
        int num = 4; 
        System.out.println(num);
        System.out.println(num+6);
        System.out.println((num+6)*5);

        int num2 = 8;
        System.out.println(num+num2);
        System.out.println(num-num2);
        System.out.println(num*num2);
        System.out.println(num2/num);
        System.out.println(num2%num); // remainder

        boolean b1 = true;
        boolean b2 = false;
        boolean res1 = b1 || b2;
        System.out.println(res1);
        boolean res2 = b1 && b2;
        System.out.println(res2);
        System.out.println(!res2);
    }
}
