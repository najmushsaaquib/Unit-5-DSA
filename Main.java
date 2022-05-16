import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int ans = fib(15);
        System.out.println(ans);

    }

    public static int fib(int x) {
        if (x == 0 || x == 1)
            return x;

        int fibx1 = fib(x - 1);
        int fibx2 = fib(x - 2);
        int fibnum = fibx1 + fibx2;

        return fibnum;
    }
}