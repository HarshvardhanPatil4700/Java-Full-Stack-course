// RelationalOperators : ==,!=,>,<,>=,<=

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        boolean res1 = x<y;
        System.out.println(res1);
        boolean res2 = x>y;
        System.out.println(res2);
        System.out.println(6>6);
        System.out.println(6>=6); // same for 6<=6

        boolean notequal = x != y;
        System.out.println(notequal);
        int z = 7;
        boolean notequal1 = x != z;
        System.out.println(notequal1);

        boolean isequal = x == y; // NOTE : Java does not have === strict equality as JS
        boolean isequal1 = x == z;
        System.out.println(isequal);
        System.out.println(isequal1);

        String s1 = "abc";
        String s2 = "def";
        String s3 = "def";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
